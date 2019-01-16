/*
555555555
4444 4444
333   333
22     22
1       1
*/

import java.util.Scanner;

class Pattern12 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();

		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++)
				System.out.print(num-i+1);
			System.out.print(num-i+1);
			for(int j=1;j<=2*i-3;j++)
				System.out.print(" ");
			if(i>1)
				System.out.print(num-i+1);
			for(int j=1;j<=num-i;j++)
				System.out.print(num-i+1);
			System.out.println();
		}
	}
}