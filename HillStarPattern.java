package StarPatterns;


/*
 
        * 
      * * * 
    * * * * * 
  * * * * * * * 
 
 
 */
import java.util.Scanner;

public class HillStarPattern {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int numberOfRows = sc.nextInt();
		
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
