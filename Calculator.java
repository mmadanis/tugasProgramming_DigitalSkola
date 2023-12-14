import java.util.Scanner;

class Calculator {
	public static void main(String[] args)
	{
        while (0 < 1){
            Scanner sc = new Scanner(System.in);
		    double num1, num2;
            
		    System.out.print("Enter the operator (+,-,*,/,stop): ");
	        String operator = sc.nextLine();

            while (operator.trim().isEmpty()) {
                System.out.println("Input cannot be empty");
                System.out.print("Enter the operator (+,-,*,/,stop): ");
                operator = sc.nextLine();
            }

            if (operator.equals("stop")){
		        System.out.println("..Close Calculator..");
                break;
            }

		    System.out.print("Enter the first number: ");
		    num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
		    num2 = sc.nextDouble();

		    double result = 0;

		    switch (operator) {
		        case "+":
		        	result = num1 + num2;
		        	break;
                
		        case "-":
		        	result = num1 - num2;
		        	break;
                
		        case "*":
		        	result = num1 * num2;
		        	break;
                
		        case "/":
		        	result = num1 / num2;
		        	break;
                
		        default:
		        	System.out.println("You enter wrong input");
		    }

		    System.out.println(num1 + " " + operator + " " + num2
		    				+ " = " + result);

            System.out.println();
        }
	}
}
