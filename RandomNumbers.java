// Problem 7.	Randomize numbers from N to M

import java.util.Scanner;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        if (firstNum > secondNum) {
            for (int i = 0; i <= firstNum - secondNum; i ++) {
                System.out.print(randomInteger(secondNum, firstNum) + " ");
            }
        }
        else if (firstNum < secondNum) {
            for (int i = 0; i <= secondNum - firstNum; i ++) {
                System.out.print(randomInteger(firstNum, secondNum) + " ");
            }
        }
        else {
            System.out.println("Numbers are equal.");
        }
    }

    public static int randomInteger(int min, int max) {
        Random rand = new Random();
        int randomNum = min + (int)(Math.random() * ((max - min) + 1));
        return randomNum;
    }

}
