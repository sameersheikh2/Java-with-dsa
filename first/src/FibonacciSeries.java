import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int currentValue = 1;
        int previousValue = 0;
        System.out.print("Fibonacci series up to " + num + " : " + previousValue + " ");
        while(currentValue <= num){
            System.out.print(currentValue + " ");
            int temp = currentValue;
            currentValue = currentValue + previousValue;
            previousValue = temp;
        }
    }
}
