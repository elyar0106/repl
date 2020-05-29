package REPLS;

import java.util.Scanner;

public class REPL17 {
	 public static void main(String args[]) {
		    //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
		    Scanner scan = new Scanner(System.in);
		    String lan1 = scan.nextLine();
		    String lan2 = scan.nextLine();

		    //WRITE YOUR CODE BELOW THIS LINE:
		 //    System.out.println("I will learn "+lan1+ " and "+lan2+ " at CybertekSchool." );
		 //  System.out.println("I will learn "+'"'+lan1+'"'+ " and "+'"'+lan2+'"'+ " at CybertekSchool." );
		  System.out.println("I will learn "+"\""+lan1+"\""+ " and "+"\""+lan2+"\""+ " at CybertekSchool." );
		   
		   String actual="I will learn "+"\""+lan1+"\""+ " and "+"\""+lan2+"\""+ " at CybertekSchool.";
		   String expected="I will learn \"Java\" and \"SQL\" at CybertekSchool.";
		   if(actual.equals(expected)) {
			   System.out.println("oh yeah!");
		   }else {
			   System.out.println("oh gosh!");
		   }
	 }
	 
}


