package StarPatterns;

/*
 
  * * * * * * * * * * * 
    * * * * * * * * * 
      * * * * * * * 
        * * * * * 
          * * * 
            * 
            * 
          * * * 
        * * * * * 
      * * * * * * * 
    * * * * * * * * * 
  * * * * * * * * * * * 

 */


import java.util.Scanner;

public class SandglassStarPattern {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int numberOfRows = sc.nextInt();
		
		//reversehill pattern
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
		
		// hill pattern
		for( int row=1;row <=numberOfRows;row++) {
			//decreasing space triangle
			for(int space =row;space <=numberOfRows;space++) {
				System.out.print("  ");
			}
			//increasing star triangle
			for(int stars =1;stars <=row;stars++) {
				System.out.print("* ");
			}
			//increasing star triangle, make the loop run one less time for hill pattern
			for(int stars =1;stars <row;stars++) {
				System.out.print("* ");
			}
		
			System.out.println();
		}
			
	sc.close();

	}

}
