//Problem 5.	Convert from decimal system to base-7
import java.util.Scanner;
public class ConvertDecimalToBase7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String output = Integer.toString(input, 7);
        System.out.println(output);
    }
}
