import java.util.Scanner;

public class CalculatorDemoA4 {

	public static void main(String[] args) {

		CalculatorA4 x;
		Scanner s = new Scanner(System.in);
		int op;
		double a,b;
		
		do {
			
			System.out.println("***** A SIMPLE CALCULATOR *****");
			System.out.println("1. ADDITION (+)");
			System.out.println("2. SUBTRACTION (-)");
			System.out.println("3. MULTIPLICATION (*)");
			System.out.println("4. DIVISION (/)");
			System.out.println("5. EXIT");
			System.out.print("\nChoose your Operation(1-5): ");
			op=s.nextInt();
			
			switch(op) {
			
				case 1:
					System.out.println("\n+++++ ADDITION(a+b) +++++");
					System.out.print("Enter a: ");
					a=s.nextDouble();
					System.out.print("Enter b: ");
					b=s.nextDouble();
					x=new CalculatorA4(a,b);
					System.out.println("Sum(a+b)= "+x.add());
					break;
					
				case 2:
					System.out.println("\n----- SUBTRACTION(a-b) -----");
					System.out.print("Enter a: ");
					a=s.nextDouble();
					System.out.print("Enter b: ");
					b=s.nextDouble();
					x=new CalculatorA4(a,b);
					System.out.println("Difference(a-b)= "+x.subtract());
					break;
					
				case 3:
					System.out.println("\n***** MULTIPLICATION(a*b) *****");
					System.out.print("Enter a: ");
					a=s.nextDouble();
					System.out.print("Enter b: ");
					b=s.nextDouble();
					x=new CalculatorA4(a,b);
					System.out.println("Product(a*b)= "+x.multiply());
					break;
					
				case 4:
					System.out.println("\n///// DIVISION(a/b) /////");
					System.out.print("Enter a: ");
					a=s.nextDouble();
					do {
						System.out.print("Enter b: ");
						b=s.nextDouble();
						if(b==0)
							System.out.println("Division by 0 is not defined. Please Try Again ...");
						else {
							x=new CalculatorA4(a,b);
							System.out.println("Quotient(a/b)= "+x.divide());
						}
					} while(b==0);
					break;	
				
				case 5:
					System.out.println("Thank You for using this Application ... Good Byee !!!");
					break;
					
				default:
					System.out.println("Invalid Option. Please Try Again ....");
					break;
			}
			
		} while(op!=5);
		
		s.close();
	}

}
