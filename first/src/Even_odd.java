import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number :");
        int num = input.nextInt();
        if(num%2 == 0){
            System.out.print(num + " is a odd number");
        }else
            System.out.print(num + " is a even number");
        }
}
