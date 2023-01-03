import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        char operator;
        Double num1, num2, results;

        //create an object of Scanner class
        Scanner input = new Scanner(System.in);

        //ask users to enter operator
        System.out.println("Select an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        //ask users to enter numbers
        System.out.println("Enter num1");
        num1 = input.nextDouble();

        System.out.println("Enter num2");
        num2 = input.nextDouble();

        switch(operator){
            //performs addition between numbers
            case '+':
                results = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + results);
                break;

            //performs subtraction between numbers
            case '-':
                results = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + results);
                break;
            //performs multiplication between numbers
            case '*':
                results = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + results);
                break;
            //performs division between numbers
            case '/':
                results = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + results);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        input.close();
    }
}
