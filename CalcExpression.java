//Problem 4.	Calculate expression

import java.util.Scanner;

public class CalcExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        double resultF1 = Math.pow(
                (
                        ( (Math.pow(a, 2) + Math.pow(b, 2)) ) /
                        (   Math.pow(a, 2) - Math.pow(b, 2) )
                ), (a + b + c) / Math.sqrt(c)   );

        double resultF2 = Math.pow( (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)), (a - b) );

        double avgNumbers = (a + b + c) / 3;
        double avgFormulas = (resultF1 + resultF2) / 2;
        double difference = avgFormulas - avgNumbers ;

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", resultF1, resultF2, difference);
    }
}
