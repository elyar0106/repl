package self_study;

import java.util.Scanner;

public class question37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("enter 2 numbers:");
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				if(num1==num2) {
					System.out.println(num1+" and "+num2+" are equal");
				}
				else if   (num1>num2) {
						System.out.println(num1+" is greater than "+num2);
				}
				else   {
							System.out.println(num2+" is greater then "+num1);
				  }
				
				
	}			
				
}
