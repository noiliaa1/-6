import java.util.Random;

public class Task1 {
    public static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            numbers[i] = random.nextInt(100);
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Ваш згенерований масив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nКількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
    }
}
