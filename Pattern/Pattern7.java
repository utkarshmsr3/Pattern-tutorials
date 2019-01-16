/*
    1
   10
  101
 1010
10101
*/

import java.util.Scanner;

class Pattern7 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();

		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(j%2);
			System.out.println();
		}
	}
}