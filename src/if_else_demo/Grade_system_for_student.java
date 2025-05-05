package if_else_demo;

import java.util.Scanner;
public class Grade_system_for_student {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Marks:");
		Double marksofStudent = scan.nextDouble();
		
		if(marksofStudent > 100) {
			System.out.println("Not found!");
		}
		else if(marksofStudent >= 90) {
			System.out.println("O grade!");
		}
		else if(marksofStudent>=75) {
			System.out.println("A+ grade!");
		}
		else if(marksofStudent>=60) {
			System.out.println("A grade!");
		} 
		else if(marksofStudent>=35) {
			System.out.println("pass");
		}
		else if(marksofStudent< 35) {
			System.out.println("fail");
		}
	}

}
