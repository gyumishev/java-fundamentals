//Problem 3.	Formatting Numbers
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        System.out.printf("|%-10s|%10s|%10.2f|%-10.3f|",
                Integer.toHexString(a).toUpperCase(),
                Integer.toBinaryString(a).replace(' ', '0'),
                b,
                c
                );

    }
}