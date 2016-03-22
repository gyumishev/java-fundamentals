//Problem 2.	Triangle Area

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aX = Integer.parseInt(scanner.nextLine());
        int aY = Integer.parseInt(scanner.nextLine());
        int bX = Integer.parseInt(scanner.nextLine());
        int bY = Integer.parseInt(scanner.nextLine());
        int cX = Integer.parseInt(scanner.nextLine());
        int cY = Integer.parseInt(scanner.nextLine());

        int area = Math.abs( (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2 );
        System.out.println(area);
    }
}
