package StarPatterns;

/*
 
* * * * 
*     * 
*     * 
* * * * 


 */

import java.util.Scanner;

public class HollowSquareStarPattern {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int numberOfRows = sc.nextInt();
		
		for( int rows=1; rows <=numberOfRows; rows++) {
			for( int columns=1; columns <=numberOfRows; columns++) {
				if(rows==1|| columns==1||rows==numberOfRows || columns==numberOfRows) {
					
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		sc.close();
	}

}
