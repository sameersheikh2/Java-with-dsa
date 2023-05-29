import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type the Principal Amount = ");
        int principal = input.nextInt();
        System.out.print("Type the Interest Rate (%) = ");
        float interestRate = input.nextFloat();
        System.out.print("Type the Duration/Period  = ");
        int time = input.nextInt();
        float simpleInterest = principal * interestRate * time / 100;
        System.out.print("Simple Interest earned over " + time + " years would be = " + simpleInterest + " Rs.");
    }
}
