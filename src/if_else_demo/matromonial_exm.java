package if_else_demo;

import java.util.Scanner;

public class matromonial_exm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your gender:");
		String gender = scan.nextLine();
		
		System.out.println("Enter your age:");
		int age = scan.nextInt();
		
		if(age >=18 && gender.equalsIgnoreCase("female")) {
			System.out.println("Eligible for regestration! ");
		}
		else if(age >= 21 && gender.equalsIgnoreCase("male")) {
			System.out.println("Eligible for registration! ");
		}
		else {
			System.out.println("Not eligible ");
		}
		

	
	}
}
