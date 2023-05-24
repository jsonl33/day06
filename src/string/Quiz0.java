package string;

import java.util.Scanner;

public class Quiz0 {
	public static void login(
			boolean session,
			String[] id, 
			String[] pwd, 
			String loginId, 
			String loginPwd) {
		for (int i = 0; i < id.length; i++) {
			if (loginId.equals(id[i]) && loginPwd.equals(pwd[i])) {
				System.out.println("인증통과");
				session = true;
			} else if (session == false && !loginId.equals(id[i])) {
				throw new RuntimeException("존재하지 않는 아이디 입니다.");
			} else if (session == false && !loginPwd.equals(pwd[i])) {
				throw new RuntimeException("비밀번호가 틀렸습니다");
			}
		}
	}

	public static void signUp(String[] id, String[] pwd, String userId, String userPwd) throws RuntimeException {
		for (int i = 0; i < id.length; i++) { // 아이디 중복 체크
			if (userId.equals(id[i])) {
				System.out.println("동일한 아이디가 존재합니다");
				break;
			} else if (id[i] == null) {
				System.out.println("가입을 축하합니다");
				id[i] = userId;
				pwd[i] = userPwd;
				break;
			} else if (id[id.length - 1] != null) {
				throw new RuntimeException("더 이상 저장할 공간이 없습니다");
			}
		}
	}

	public static void userInfo(String[] id, String[] pwd) {
		for (int i = 0; i < id.length; i++) {
			if (id[i] != null) {
				System.out.println("id:" + id[i] + "\npwd:" + pwd[i]);
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] id = new String[5];
		String[] pwd = new String[5];
		boolean session = false;
		while (true) {
			if(session == false) {
				System.out.println("1. 로그인");
				System.out.println("2. 회원가입");
				System.out.println("3. 회원조회");
				System.out.println("4. 프로그램 종료");
				int sel = sc.nextInt();
				switch (sel) {
				case 1:
					String loginId = sc.next();
					String loginPwd = sc.next();
					try {
						login(session, id, pwd, loginId, loginPwd);
					}catch (RuntimeException e){
						System.out.println(e.getMessage());
					}
					break;
				case 2:
					String userId = sc.next();
					String userPwd = sc.next();
					try {
						signUp(id, pwd, userId, userPwd);
					} catch (RuntimeException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					userInfo(id, pwd);
					break;
				case 4:
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					return;
				}
			}
		}
	}
}
