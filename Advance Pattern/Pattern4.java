/*
1
2       4
3       6       9
4       8       12      16
5       10      15      20      25
6       12      18      24      30      36
7       14      21      28      35      42      49
8       16      24      32      40      48      56      64
9       18      27      36      45      54      63      72      81
10      20      30      40      50      60      70      80      90      100
*/

import java.util.Scanner;

class Pattern4 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();



		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(i*j+"\t");
			System.out.println();
		}
	}
}