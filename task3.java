import java.util.Scanner;
import java.util.Random;

public class Task3 {
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

        System.out.print("Введіть значення для пошуку: ");
        int searchValue = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < arraySize; i++) {
            if (numbers[i] == searchValue) {
                found = true;
                System.out.print("Введіть значення для заміни: ");
                int replacementValue = scanner.nextInt();
                numbers[i] = replacementValue;
                System.out.println("Значення змінено.");
                break;
            }
        }

        if (!found) {
            System.out.println("Значення не знайдено в масиві.");
        }

        System.out.println("Оновлений масив:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
