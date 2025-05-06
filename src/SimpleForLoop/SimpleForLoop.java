package SimpleForLoop;

public class SimpleForLoop {
	public  static void main(String[] args) {
		// Nested loop
		for(int a = 1; a<=10; a++) {
			//System.out.println("Number table for: "+a);
			for(int b = 1; b<=10;b++) {
				int c = a*b;
				//System.out.println(+ a +" * "+b+ " = "+c);
			}
		}
		
		// while loop
		int a = 0;
		while(a<=9) {
			System.out.println("Number table for: "+a);
			a++;
			
			int b = 1;
			while(b<=10) {
				int c = a*b;
				System.out.println(+ a +" * "+b+ " = "+c);
				b++;
			}
		}
	}
}
