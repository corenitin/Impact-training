package wap_to_swap_to_num;

import java.util.Scanner;
public class Wap_to_swap_to_num {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter first number: ");
	        int a = scanner.nextInt();
	        System.out.print("Enter second number: ");
	        int b = scanner.nextInt();

	        System.out.println("Before swapping: a = " + a + ", b = " + b);

	       
	        int temp = a;
	        a = b;
	        b = temp;

	        System.out.println("After swapping: a = " + a + ", b = " + b);
	    }
	}


