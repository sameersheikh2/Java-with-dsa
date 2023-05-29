import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        float r = in.nextFloat();
        double res = Math.PI * r * r;
        System.out.print(res);
    }
}
