import java.util.Scanner ;
class Calculator {
	public static void main (String [] args ){
		Scanner sc = new Scanner (System.in);
	System.out.print("Enter the value of num1 : ");
		int num1 = sc.nextInt();
	System.out.print("Enter the value of num2 : ");
		int num2 = sc.nextInt();
	System.out.print("Enter the operations (+,-,*,/,%) : ");
		char Operation = sc.next().charAt(0);
	
	// here Switch case is used to perform the operations like (+,-,*,/,%)

			switch(Operation){
				case '+':
				System.out.print("The Addition of two number is : " + (num1 + num2));
				break;
				case '-':
				System.out.print("The Subtraction of two number is : " + (num1 -  num2));
				break;
				case '*':
				System.out.print("The Multiplication of two number is : " + (num1 * num2 ));
				break;
				case '/':
				if (num2 != 0){
				System.out.print("The Division of two number is : " + (num1 / num2 ));
				}
				else {
				System.out.print("Division by zero number is not allowed ");
				}
				break;
				case '%':
				if (num2 != 0){
				System.out.print("The Modulus of two number is : " + (num1 % num2 ));
				}
				else {
				System.out.print("Modulus by zero number is not allowed ");
				}
				break;
			default :
				System.out.print("You have Enter the Invalid Number ");
			}
	}
}
