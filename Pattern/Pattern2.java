/*
    1
   21
  321
 4321
54321
*/
import java.util.Scanner;
class Pattern2 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();

		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++)
				System.out.print(" ");
			for(int j=i;j>=1;j--)
				System.out.print(j);
			System.out.println();
		}
	}
}