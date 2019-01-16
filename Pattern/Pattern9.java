/*
    1
   212
  32123
 4321234
543212345
*/

import java.util.Scanner;

class Pattern9 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();

		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++)
				System.out.print(" ");
			for(int j=i;j>=1;j--)
				System.out.print(j);
			for(int j=2;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
	}
}