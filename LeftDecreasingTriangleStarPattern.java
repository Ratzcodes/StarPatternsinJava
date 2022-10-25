package StarPatterns;
/*
 
* * * * 
* * * 
* * 
* 
 
 */
import java.util.Scanner;

public class LeftDecreasingTriangleStarPattern {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int numberOfRows = sc.nextInt();
		
		// left decreasing triangle pattern
				for(int row=1; row <=numberOfRows;row++) {
					for ( int stars=row; stars <=numberOfRows; stars++) {
					System.out.print("* ");
					}
					System.out.println();
				}
		

	sc.close();
	}

}
