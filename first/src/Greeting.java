import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        System.out.print("Type you name : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Hello, " + name + "!");
    }
}
