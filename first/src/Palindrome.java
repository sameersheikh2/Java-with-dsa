import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String reverseString = "";
        String str = input.next();
        for(int i = str.length()-1; i >= 0; i--){
            reverseString = reverseString + str.charAt(i);
        }
        if(str.equals(reverseString)){
            System.out.println("Given string \"" + str + "\" is a palindrome.");
            System.out.println(str + " = " + reverseString);}
        else{
            System.out.println("Given string " + str + " is not a palindrome. ");
            System.out.println(str + " = " + reverseString);}
    }
}
