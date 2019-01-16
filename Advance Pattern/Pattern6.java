/*
1
1       2
3       5       8
13      21      34      55
89      144     233     377     610
*/

import java.util.Scanner;

class Pattern6 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();

		int a=1,b=1;
		for(int i=1;i<=num;i++)	{
			for(int j=1;j<=i;j++) {
				System.out.print(a+"\t");
				b=a+b;
				a=b-a;
			}
			System.out.println();
		}
	}
}