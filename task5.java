import java.util.Scanner;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмір вашого масиву: ");
        int arraySize = scanner.nextInt();

        int[] numbers = new int[arraySize];
        System.out.println("Масив випадкових чисел:");
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        boolean grows = true;
        boolean comes = true;

        for (int i = 0; i < arraySize - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                grows = false;
            }
            if (numbers[i] < numbers[i + 1]) {
                comes = false;
            }
        }

        if (grows) {
            System.out.println("Ваш масив впорядковано за зростанням.");
        } else if (comes) {
            System.out.println("Ваш масив впорядковано за спаданням.");
        } else {
            System.out.println("Ваш масив не впорядкований.");
        }
    }
}
