/*
543212345
5432 2345
543   345
54     45
5       5
5       5
54     45
543   345
5432 2345
543212345
*/

import java.util.Scanner;

class Pattern13 {
	public static void main(String args[]) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();

		for(int i=1;i<=num;i++) {
			for(int j=num;j>i;j--)
				System.out.print(j);
			System.out.print(i);
			for(int j=1;j<=2*i-3;j++)
				System.out.print(" ");
			if(i>1)
				System.out.print(i);
			for(int j=i+1;j<=num;j++)
				System.out.print(j);
			System.out.println();
		}

		for(int i=num;i>=1;i--) {
			for(int j=num;j>i;j--)
				System.out.print(j);
			System.out.print(i);
			for(int j=1;j<=2*i-3;j++)
				System.out.print(" ");
			if(i>1)
				System.out.print(i);
			for(int j=i+1;j<=num;j++)
				System.out.print(j);
			System.out.println();
		}
	}
}