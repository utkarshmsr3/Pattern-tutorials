/*
    1
   222
  33333
 4444444
555555555
*/

import java.util.Scanner;

class Pattern8 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();

		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
				System.out.print(i);
			System.out.println();
		}
	}
}