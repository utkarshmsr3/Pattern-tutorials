/*
                                                1
                                        4       9       16
                                25      36      49      64      81
                        100     121     144     169     196     225     256
                289     324     361     400     441     484     529     576     625
        676     729     784     841     900     961     1024    1089    1156    1225    1296
1369    1444    1521    1600    1681    1764    1849    1936    2025    2116    2209    2304    2401
*/

import java.util.Scanner;

class Pattern3 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=sc.nextInt();


		int count=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) 
				System.out.print("\t");
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(count*count+"\t");
				count++;		
			}
			System.out.println();
		}
	}
}