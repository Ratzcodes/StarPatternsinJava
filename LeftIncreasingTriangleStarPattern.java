package StarPatterns;

//left increasing triangle pattern / right sided right angle triangle

/*

* 
* * 
* * * 
* * * * 


 */
import java.util.Scanner;

public class LeftIncreasingTriangleStarPattern {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int numberOfRows = sc.nextInt();

		
		for(int row=1; row <=numberOfRows;row++) {
			for ( int stars=1; stars <=row; stars++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
