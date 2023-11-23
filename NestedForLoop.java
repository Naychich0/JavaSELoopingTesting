package lo6;

import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {
//		==================B
//		for(int i = 10; i>=1;i--) {
//			for(int j=1; j<=i;j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
//		=================A
//		for(int i=1 ;i<=10 ; i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//			for(int i=1;i<=5;i++) {
//				for(int j=1;j<=5;j++) {
//					if(j==i) {
//						System.out.print("U");
//					}else {
//					System.out.print("*");
//					}
//				}
//				System.out.println();
//
//			}
		
//		for(int i=1;i<=5;i++) {
//			
//			for(int j=1;j<=5;j++) {
//				int rem = i%2;
//				if(rem==0 ) {
//					System.out.print("I");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//
//		}
		

//		=================C
		
//		for(int i=6;i>=1;i--) {
//			for(int j=6;j>i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//   	==================D
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		
//		
		for(int i=num;i>=1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=num; k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}

//		=================D
		
//		for(int i=1;i<=10;i++) {
//			for(int j=10;j>i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
	}

}
