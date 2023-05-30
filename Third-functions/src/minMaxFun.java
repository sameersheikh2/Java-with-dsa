import java.util.Scanner;

public class minMaxFun {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("Maximum of the three numbers is : " + maximum(a,b,c));
        System.out.print("Minimum of the three numbers is : " + minimum(a,b,c));
    }
    static int maximum(int num1, int num2,int num3){
        if(num1 >= num2 && num1 >= num3)return num1;
        else if(num2>= num1 && num2 >= num3) return num2;
        return num3;
    }
    static int minimum(int num1, int num2,int num3){
        if(num1 <= num2 && num1 <= num3)return num1;
        else if(num2<= num1 && num2 <= num3) return num2;
        return num3;
    }
}
