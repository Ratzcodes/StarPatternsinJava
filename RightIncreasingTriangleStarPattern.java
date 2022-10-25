package StarPatterns;
/*
 
        * 
      * * 
    * * * 
  * * * * 
  
 */

import java.util.Scanner;

//right sided increasing triangle
public class RightIncreasingTriangleStarPattern {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int numberOfRows = sc.nextInt();
		
				for( int row=1;row <=numberOfRows;row++) {
					for(int space=row;space <=numberOfRows;space++) {
						System.out.print("  ");
					}
					
					for( int stars=1; stars <=row; stars++) {
						System.out.print("* ");
					}
					
					System.out.println();
				} 
				
	sc.close();
	}

}
