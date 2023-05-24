package string;

public class Quiz02 {
	public static void main(String[] args) {
		String str = "It is a fun java programming";
		int total = 0;
		int a = 0;
		int g = 0;
		for(int i = 0;i<str.length();i++) {
			total++;
			if(str.charAt(i) == 'a') {
				a++;
			}
			else if(str.charAt(i) == 'g') {
				g++;
			}
		}
		System.out.println("총 개수: "+total);
		System.out.println("a 개수: "+a);
		System.out.println("g 개수: "+g);
		
	}
}
