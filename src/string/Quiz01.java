package string;

public class Quiz01 {
	public static void main(String[] args) {
		String str = "Have a nice day Have a nice day Have a nice day";
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) == 'a') {
				System.out.println(i);
			}
		}
	}
}