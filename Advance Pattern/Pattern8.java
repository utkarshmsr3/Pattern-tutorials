/*
1
3 2
4 5 6
10 9 8 7
11 12 13 14 15
*/

import java.util.Scanner;



class Pattern8 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();



		int count=1;
		for(int i=1;i<=num;i++) {
			if(i%2==1)
				for(int j=1;j<=i;j++) {
					System.out.print(count+" ");
					count++;
				}
			else {	
				int COUNT=count;
				for(int j=count+i-1;j>=COUNT;j--) {
					System.out.print(j+" ");
					count++;
				}
			}
			System.out.println();
		}
	}
}