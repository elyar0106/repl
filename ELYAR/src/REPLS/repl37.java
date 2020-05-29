package replIt;

import java.util.Scanner;

public class repl37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		
		do {
			System.out.println("enter 2 number:");
			 num1= sc.nextInt();
			 num2 = sc.nextInt();
		}while(num1==num2);

	}

}
