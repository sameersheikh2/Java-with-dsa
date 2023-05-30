import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //String[] arr = [];
        //DataType of array[] array/variable name = array size[5]
        //Array.toString(arr)
        //arr[index]
        //for(int num : arr) print(num);  --> to print out elements inside array
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();

        if(num == 1 || num == 0)
            System.out.print(num + "! = " + getFactorial(num));
        else
            System.out.print(num + "! = " + getFactorial(num));
    }
    static int getFactorial(int n){
        int factorial = 1;
        for(int i = 2; i<= n; i++)
            factorial *= i;
        return factorial;
    }
}
