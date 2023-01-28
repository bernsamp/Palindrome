import java.util.*;

public class Main
{
    public static void main(String[] args){

        System.out.println("Enter a number or a string to check if it is a palindrome");

        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

        String reversed = "";

        int length = userInput.length();

        for (int i = length - 1; i >= 0; i--){
            reversed += userInput.charAt(i);
        }

            if (userInput.equals(reversed)) {
                System.out.println(userInput + " is a palindrome.");
            }else
                System.out.println(userInput + " is not a palindrome.");
        }
    }
