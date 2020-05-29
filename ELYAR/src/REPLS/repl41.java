package replIt;

import java.util.Scanner;

public class repl41 {
	/*
	 * In the Happy Valley School System, children are classified by age as follows:
	 * 
	 * less than 2, ineligible
	 *  2, toddler 
	 *  3-5, early childhood 
	 *  6-7, young reader
	 * 8-10, elementary 
	 * 11 and 12, middle 
	 * 13, impossible 
	 * 14-16, high school 
	 * 17-18, scholar 
	 * greater than 18, ineligible
	 * 
	 * Given an int variable age, write an if statement that prints out, on a line
	 * by itself, the appropriate label from the above list based on age.
	 * 
	 * Example: -Display prompt: Enter age: 8 -Display prompt: elementary
	 */

	public static void main(String[] args) {
		
		
		int age;
		
		Scanner scan = new  Scanner(System.in);
		
		System.out.println("Enter age:");
		age = scan.nextInt();
		
		if(age<2 || age>18) {
			System.out.print("ineligible");
		}else if(age == 2) {
			System.out.print("toddler");
		}else if(age>=3 && age<=5) {
			System.out.print("early childhood");
		}else if(age == 6 || age == 7) {
			System.out.print("young reader");
		}else if(age>=8 && age<=10) {
			System.out.print("elementary");
		}else if(age==11 || age == 12) {
			System.out.print("middle");
		}else if(age == 13) {
			System.out.print("impossible");
		}else if(age>=14 && age<=16) {
			System.out.print("high school");
		}else if(age == 17 || age ==18) {
			System.out.print("scholar");
		}
		
		
		
		
		
		
		
		
	}

}
