import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        if(num1 > num2) System.out.print(num1 + " is the largest number");
        else if(num1 == num2) System.out.print("both the numbers are equal");
        else System.out.print(num2 + " is the largest number");
    }
}
