/*
0
10
010
1010
01010
*/

import java.util.Scanner;

class Pattern6 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();

		for(int i=0;i<num;i++) {
			for(int j=i;j>=0;j--)
				System.out.print(j%2);
			System.out.println();
		}
	}
}