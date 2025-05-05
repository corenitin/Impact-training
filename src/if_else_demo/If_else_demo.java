package if_else_demo;

import java.util.Scanner;

public class If_else_demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the age: ");
		int age = scan.nextInt();
		if (age >=18) {
			System.out.println("you are eligible for voting ");
		}
		else {
			System.out.println("Not eligible ");
		}
	}

	
}
