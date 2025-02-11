import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість ваших кутів: ");
        int numAngles = scanner.nextInt();
        int[] angles = new int[numAngles];
        int totalAngleSum = 0;

        System.out.println("Введіть значення для ваших кутів: ");
        for (int i = 0; i < numAngles; i++) {
            angles[i] = scanner.nextInt();
            totalAngleSum += angles[i];
        }

        int idealSum = 180 * (numAngles - 2);

        System.out.println("Сума кутів для ідеального багатокутника: " + idealSum);
        System.out.println("Сума кутів для вказаного багатокутника: " + totalAngleSum);

        if (totalAngleSum == idealSum) {
            System.out.println("Такий багатокутник може існувати.");
        } else {
            System.out.println("Такий багатокутник не може існувати.");
        }
    }
}
