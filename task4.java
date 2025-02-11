import java.lang.Math;

public class task4 {
    public static void main(String[] args) {
        int degree = 1;

        System.out.println("Таблиця sin від 0 до 90: ");
        int count = 0;

        for (int i = 0; i <= 90; i += degree) {
            double radians = Math.toRadians(i);
            double sin = Math.sin(radians);
            System.out.printf("%7.4f", sin);

            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println();
    }
}
