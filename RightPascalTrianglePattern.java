package StarPatterns;

/* 
 
* 
* * 
* * * 
* * * * 
* * * 
* * 
*
 
 */

import java.util.Scanner;

public class RightPascalTrianglePattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
	    int numberOfRows =  sc.nextInt();
	    
	    
	    // increasing triangle pattern
	    for( int rows=1; rows <=numberOfRows ; rows++) {
	    	for ( int stars=1; stars <=rows; stars++) {
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    }
	    
	    for ( int rows2=1; rows2 <=numberOfRows; rows2++) {
	    	for( int stars=rows2; stars <numberOfRows; stars++){
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    }
	
	sc.close();
	}

}
