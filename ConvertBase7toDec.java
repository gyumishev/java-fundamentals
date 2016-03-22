//Problem 6.	Convert from base-7 to decimal
import java.util.Scanner;
public class ConvertBase7toDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int output = Integer.valueOf(input, 7);
        System.out.println(output);
    }
}
