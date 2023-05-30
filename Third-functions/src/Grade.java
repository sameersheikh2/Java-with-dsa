import java.util.Arrays;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks here : ");
        int marks = in.nextInt();

        if(marks < 0 || marks > 100)  System.out.println("Invalid marks!!");
        else{
        String result = checkResult(marks);
        System.out.print("Your result is : " + result);
        }
    }
    static String checkResult(int m){
        if(m >= 91 && m <= 100) return "AA";
        else if(m >= 81 && m <= 90) return "AB";
        else if(m >= 71 && m <= 80) return "BB";
        else if(m >= 61 && m <= 70) return "BC";
        else if(m >= 51 && m <= 60) return "CD";
        else if(m >= 41 && m <= 50) return "DD";
        return "Fail";
    }
}
