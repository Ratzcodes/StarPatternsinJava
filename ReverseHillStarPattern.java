package StarPatterns;

/* 
 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
 
 
 
 
 */

import java.util.Scanner;

public class ReverseHillStarPattern {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int numberOfRows = sc.nextInt();
		
		for(int row=1; row <=numberOfRows;row++) {
			//increasing space
			for (int space=1;space <=row;space++) {
				System.out.print("  ");
			}
			//decreasing stars
			for(int stars =row;stars <numberOfRows;stars++) {
				System.out.print("* ");
			}
			//decreasing stars
			for(int stars =row;stars <=numberOfRows;stars++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			
	sc.close();
	}

}
