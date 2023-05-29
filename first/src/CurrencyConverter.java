import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rupees : ");
        double rs = input.nextDouble();
        System.out.print(rs + " Indian Rupee equivalent to : " + (rs * 0.012) + " US Dollars (USD)");
    }
}
