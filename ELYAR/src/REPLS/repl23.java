package REPLS;

import java.util.Scanner;

public class repl23 {
	public static void main (String[] args) {
	    Scanner src=new Scanner(System.in);
	    System.out.println("please enter areaCode");
	    int areaCode=src.nextInt();
	    System.out.println("please enter localNumber");
	    int localNumber=src.nextInt();
	    
			/*
			 * //convert using Integer.toString(int) The Integer class has a static method
			 * that returns a String object representing the specified int parameter. ...
			 * Convert using String.valueOf(int) ... Convert using Integer(int).toString()
			 * ...
			 */
	    String phoneNumber="-(".concat(String.valueOf(areaCode)).concat(")").concat("-").concat(String.valueOf(localNumber));
	   
	    
	    System.out.println("Calling number "+phoneNumber);
	    
	  }
	  
	
}
