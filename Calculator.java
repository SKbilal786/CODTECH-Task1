import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the value of num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the value of num2: ");
        int num2 = scanner.nextInt();

        // Prompt user for operation
        System.out.print("Enter the operation (+, -, *, /, %): ");
        char operation = scanner.next().charAt(0);

        // Perform the operation based on user input
        switch (operation) {
            case '+':
                System.out.println("The summation of the numbers is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The subtraction of the numbers is: " + (num1 - num2));
                break;
            case '*':
                System.out.println("The multiplication of the numbers is: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("The division of the numbers is: " + (num1 / (double) num2)); // Cast to double for decimal results
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    System.out.println("The modulus of the numbers is: " + (num1 % num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("The entered operation is incorrect.");
                break;
        }

    }
}
