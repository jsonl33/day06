package array;

public class Test02 {
	public static void main(String[] args) {
		int arr[] = new int[] {10,54,13,17,25,30};
		for (int i:arr) {
			if(i % 2 == 0) {
				System.out.println("짝수: "+i);
			}
			else {
				System.out.println("홀수: "+i);
			}
		}
	}
}
