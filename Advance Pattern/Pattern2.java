/*
1       2       3       4       5       6       7       8       9       10
36      37      38      39      40      41      42      43      44      11
35      64      65      66      67      68      69      70      45      12
34      63      84      85      86      87      88      71      46      13
33      62      83      96      97      98      89      72      47      14
32      61      82      95      100     99      90      73      48      15
31      60      81      94      93      92      91      74      49      16
30      59      80      79      78      77      76      75      50      17
29      58      57      56      55      54      53      52      51      18
28      27      26      25      24      23      22      21      20      19
*/

import java.util.Scanner;

class Pattern2 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
			System.out.print(i+"\t");

		System.out.println();

		for(int i=1;i<=n-n/2-1;i++) {

			for(int j=1;j<=i-1;j++) 
				System.out.print(4*j*n-4*j*j-(i-1)+(j-1)+"\t");
		
			for(int j=4*i*n-4*i*i;j<=4*i*n-4*i*i+n-2*i;j++)
				System.out.print(j+"\t");

			for(int j=i-1;j>=1;j--)
				System.out.print(4*j*n-4*j*j+n-2*j+i-j+"\t");
			
			System.out.print(n+i);

			System.out.println();
		}

		for(int i=n/2;i>=1;i--) {
			for(int j=1;j<=i-1;j++)
				System.out.print(2*n+4*(j-1)*n-(2*j-1)*(2*j-1)+n-(2*j-1)+i-j+"\t");

			for(int j=2*n+4*(i-1)*n-(2*i-1)*(2*i-1)+n-(2*i-1);j>=2*n+4*(i-1)*n-(2*i-1)*(2*i-1);j--)
				System.out.print(j+"\t");

			for(int j=i-1;j>=1;j--)
				System.out.print(2*n+4*(j-1)*n-(2*j-1)*(2*j-1)+j-i+"\t");

			System.out.println();
		}
	}
}
			
		


