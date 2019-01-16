/*
ABCDFEGHIJJIHGFEDCBA
ABCDEFGHI  IHGFEDCBA
ABCDEFGH    HGFEDCBA
ABCDEFG      GFEDCBA
ABCDEF        FEDCBA
ABCDE          EDCBA
ABCD            DCBA
ABC              CBA
AB                BA
A                  A
AB                BA
ABC              CBA
ABCD            DCBA
ABCDE          EDCBA
ABCDEF        FEDCBA
ABCDEFG      GFEDCBA
ABCDEFGH    HGFEDCBA
ABCDEFGHI  IHGFEDCBA
ABCDFEGHIJJIHGFEDCBA
*/

import java.util.Scanner;

class Pattern1 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a character (A-Z) = ");
		char ch=scan.next().charAt(0);

		int num=ch-65;

		for(int i=0;i<=num;i++) {
			for(int j=0;j<num-i;j++)
				System.out.print((char)(j+65));
			System.out.print((char)(num-i+65));
			for(int sp=1;sp<=2*(i);sp++)
				System.out.print(" ");
			System.out.print((char)(num-i+65));
			for(int j=num-i-1;j>=0;j--)
				System.out.print((char)(j+65));
			System.out.println();
		}

		for(int i=num-1;i>=0;i--) {
			for(int j=0;j<num-i;j++)
				System.out.print((char)(j+65));
			System.out.print((char)(num-i+65));
			for(int sp=1;sp<=2*(i);sp++)
				System.out.print(" ");
			System.out.print((char)(num-i+65));
			for(int j=num-i-1;j>=0;j--)
				System.out.print((char)(j+65));
			System.out.println();
		}
	}
}