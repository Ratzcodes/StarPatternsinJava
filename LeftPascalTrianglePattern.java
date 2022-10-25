package StarPatterns;

/*
 
          * 
        * * 
      * * * 
    * * * * 
  * * * * * 
    * * * * 
      * * * 
        * * 
          * 

 */


import java.util.Scanner;

public class LeftPascalTrianglePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
	    int numberOfRows =  sc.nextInt();
	    
	    // decreasing space pattern
	    for (int rows=1; rows <numberOfRows; rows++ ) {
	    	for( int space=rows; space <=numberOfRows; space++) {
	    		System.out.print("  ");
	    	}
	    	for (int stars=1; stars <=rows; stars++) {
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    }
	    // increasing space pattern
	    for (int rows=1; rows <=numberOfRows; rows++ ) {
	    	for( int space=1; space <=rows; space++) {
	    		System.out.print("  ");
	    	}
	    	for (int stars=rows; stars <=numberOfRows; stars++) {
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    }
	    
	    
	    

	    sc.close();
	}

}
