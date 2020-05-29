package replIt;

import java.util.*;
import java.lang.*;

public class repl32 {

	public static void main(String[] args) {
		 int itemPrice;
		    int quaters, dimes, nickels;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter price in cents:");
		    itemPrice = sc.nextInt();
		    int re = 100 - itemPrice;
		    if(itemPrice<25 || itemPrice > 100 || (itemPrice % 5 != 0)){
		      System.out.println("Invalid price!");
		    }else{
		    	quaters =(int) re/25;
		    	dimes = (int) (re-quaters*25)/10;
		    	nickels = (int) (re-quaters*25 -dimes*10)/5;
		      System.out.println("Your change is "+quaters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
		    }

	}

}
