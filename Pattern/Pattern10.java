/*
    1
   101
  10101
 1010101
101010101
*/

import java.util.Scanner;

class Pattern10 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();

		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(j%2);
			for(int j=i-1;j>=1;j--)
				System.out.print(j%2);
			System.out.println();
		}
	}
}