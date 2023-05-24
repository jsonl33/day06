package string;

public class Quiz3 {
	public static void main(String[] args) {
		String str = "tESt sTring   change    first";
		String[] changeStr = str.split("\\s+");
		for(int i = 0;i<changeStr.length;i++) {
			String fir = changeStr[i].substring(0,1);
			fir = fir.toUpperCase();
			String rem = changeStr[i].substring(1);
			rem = rem.toLowerCase();
			String result = fir+rem;
			changeStr[i] = result;
		}
		for(String i:changeStr) {
			System.out.print(i+" ");
		}
	}
}
