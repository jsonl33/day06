package array;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		System.out.print("짝수, 홀수 입력: ");
		String oddOrEven = sc.next();
		
		if(oddOrEven.equals("짝수")) {
			for (int i:arr) {
				if(i % 2 == 0) {
					System.out.println("짝수: "+i);
				}
			}
		}
		else if(oddOrEven.equals("홀수")) {
			for(int i:arr) {
				if(i % 2 != 0) {
					System.out.println("홀수: "+i);
				}
			}
		}
		sc.close();
	}
}
