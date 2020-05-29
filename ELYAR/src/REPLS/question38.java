package self_study;

import java.util.Scanner;

public class question38 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a numbers:");
		int num=sc.nextInt();
		
		if(num>0) {
			System.out.println(num+" is positive ");
		}
		else   if(num<0) {
				System.out.println(num+" is nagetive  ");
		}
		  else {
					System.out.println(num+" is zero ");
		  }
}

}
