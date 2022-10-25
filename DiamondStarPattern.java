package StarPatterns;

/* 
       * 
      * * * 
    * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
 
 */


import java.util.Scanner;

public class DiamondStarPattern {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int numberOfRows = sc.nextInt();
		
		// hill pattern
		for( int row1=1;row1 <numberOfRows;row1++) {
			//decreasing space triangle
			for(int space =row1;space <=numberOfRows;space++) {
				System.out.print("  ");
			}
			//increasing star triangle
			for(int stars =1;stars <=row1;stars++) {
				System.out.print("* ");
			}
			//increasing star triangle, make the loop run one less time for hill pattern
			for(int stars =1;stars <row1;stars++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			
		// reverse hill pattern
			for(int row2=1; row2 <=numberOfRows;row2++) {
				//increasing space
				for (int space=1;space <=row2;space++) {
					System.out.print("  ");
				}
				//decreasing stars
				for(int stars =row2;stars <numberOfRows;stars++) {
					System.out.print("* ");
				}
				//decreasing stars
				for(int stars =row2;stars <=numberOfRows;stars++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		
		sc.close();
	}

}
