import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of triangle : ");
        int b = in.nextInt();
        System.out.print("Enter the height of triangle : ");
        int h = in.nextInt();
        int area = h*b/2;
        System.out.print("Area of triangle is : " + area);
        
    }
}
