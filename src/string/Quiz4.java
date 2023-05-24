package string;

public class Quiz4 {
	public static boolean isNumeric(String i){
		try {
			Integer.parseInt(i);
			return true;
		}
		catch (Exception notNumericExeption) {
			return false;
		}
	}
	public static void main(String[] args) {
		String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
		System.out.println("====변경 전 str====");
		System.out.println(str);
		System.out.println("====변경 후 str====");
		str = str.replace(" ", "");
		str = str.replace("년", "");
		str = str.replace("\n", "-");
		String[] stringSplit = str.split("-");
		for (int i = 0;i<stringSplit.length;i++) {
			boolean isNumeric = isNumeric(stringSplit[i]);
			if(isNumeric == true) {
				stringSplit[i] = stringSplit[i]
						.replace(stringSplit[i], "1999");
			}
		}
		for(int i = 0;i<stringSplit.length;i++) {
			boolean isNumeric = isNumeric(stringSplit[i]);
			if(isNumeric == false) {
				System.out.print(stringSplit[i]+":");
			}
			if(isNumeric == true) {
				System.out.println(stringSplit[i]+"년");
			}
		}
		
	}
}
