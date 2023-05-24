package string;

public class T1 {
	public static void main(String[] args) {
		String str = new String("test");
		String str2 = "test";
		System.out.println(str);
		System.out.println(str2);
		
		String id = "aaa    ";
		String inputId="aaa";
		System.out.println(id.trim().equals(inputId));
		
		String addr = "서울/010/김길이";
		String[] addrs = addr.split("/");
		for(String i:addrs) {
			System.out.println(i);
		}
		
		String repl = addr.replace("/", "==>");
		System.out.println(repl);
	}
}
