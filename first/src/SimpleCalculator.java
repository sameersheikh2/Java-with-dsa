import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        System.out.println("Enter any number from 1 to 4 to select the operator - [+ ,- ,* ,/ ] ");
        System.out.print("1. Sum [+]  , 2. Subtract [ - ]  , 3. Division [ / ] , 4. Multiplication [ * ] ");
        int operator = input.nextInt();
        if(operator == 1)
        {System.out.print("Sum of these two number is = " + (num1 + num2));
        }
        else if(operator == 2)
        {
            System.out.print("Subtraction of these two number is = " + (num1 - num2));
        }
        else if(operator == 3){
            System.out.print("Division of these two number is = " + (num1 / num2));
    }
        else if(operator == 4){
            System.out.print("Multiplication of these two number is = " + (num1 * num2));
        }
        else{
            System.out.print("Entered wrong number to select the operator");
        }
        }
}
