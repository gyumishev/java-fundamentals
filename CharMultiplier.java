//Problem 10.	 Character Multiplier

import java.util.Scanner;
public class CharMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArgs = input.split(" ");
        String str1 = inputArgs[0];
        String str2 = inputArgs[1];

        int totalSum = 0;
        
        // int longerStringLength = str1.length() > str2.length() ? str1.length() : str2.length();
        int str1Length = str1.length();
        int stringLowLength = str2.length();
        
        if(stringLowLength < str1Length){
            // methods -> string1, string2, str1Length () -> int
            totalSum = CalculateLengthMethod(str1, str2, stringLowLength);
        }
        else if(stringLowLength > str1Length){
            totalSum = CalculateLengthMethod(str1, str2, str1Length);
        }
        else{
            for (int i = 0; i < str1.length(); i++) {
                totalSum += str1.charAt(i) * str2.charAt(i);
            }
        }

        System.out.println(totalSum);

    }

    private static int CalculateLengthMethod(String str1, String str2, int stringLowLength) {
        int currentSum = 0;
        
        for (int i = 0; i < stringLowLength; i++) {
            currentSum += str2.charAt(i) * str1.charAt(i);
        }

        String biggerSting = str1.length() > str2.length() ? str1 : str2;

        for (int i = stringLowLength; i < biggerSting.length() ; i++) {
            currentSum += biggerSting.charAt(i);
        }
        return currentSum;
    }
}
