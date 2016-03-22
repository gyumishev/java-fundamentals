//Problem 11.	 Get First Odd or Even Elements
import java.util.*;

public class GetFirstOddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<>();

        System.out.println("Enter count of numbers: ");
        int count = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            numbersList.add(Integer.parseInt(numbers[i]));
        }

        String command = scanner.nextLine();
        String[] commandArgs = command.split(" ");
        int elementsCount = Integer.parseInt(commandArgs[1]);
        String type = commandArgs[2];

        getNumbers(type, numbersList, elementsCount);

    }

    public static void getNumbers(String type, List<Integer> numbers, int elementsCount) {

        switch (type){
            case "odd":
                int oddCounter =0;
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) % 2 != 0) {
                        System.out.print(numbers.get(i) + " ");
                        oddCounter++;
                    }
                    if (oddCounter >= elementsCount) {
                        break;
                    }
                }
                break;
            case "even":
                int evenCounter =0;
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) % 2 == 0) {
                        System.out.print(numbers.get(i) + " ");
                        evenCounter++;
                    }
                    if (evenCounter >= elementsCount) {
                        break;
                    }
                }
                break;
            default:
                break;
        }
    }

}
