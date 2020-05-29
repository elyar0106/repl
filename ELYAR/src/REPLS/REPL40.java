package REPLS;

import java.util.Scanner;

public class REPL40 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("what is the farthest planet in the solar system:");
		System.out.println("a)venus");
		System.out.println("b)pluto");
		System.out.println("c)neptune");

		String a = s.nextLine();
		
		
		
		
		/*
		 * if(a=="a") { System.out.println(a+" is wrong"); }else if(a=="b") {
		 * System.out.println(a+" is correct"); }else if(a=="c") {
		 * System.out.println(a+" is wrong"); }else { System.out.println(a
		 * +" is not valid answer" ); }
		 */
		
		 switch(a) { 
		 case "a" : 
			 System.out.println(a+" is wrong"); 
			 break; 
		 case "b" :
		  System.out.println(a+" is correct");
		  break; 
		  case "c" :
		  System.out.println(a+" is wrong"); 
		  break;

		default :
		  System.out.println(a+" is not valid answer"); break;
		  
		  }
		 
		 
	}

}
