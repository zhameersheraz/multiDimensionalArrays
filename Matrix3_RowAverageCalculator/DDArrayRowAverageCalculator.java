import java.util.Scanner;

/**
 * Reads a 2D double matrix of user-chosen size, then prints the average of each row
 * (two decimals).
 *
 * <p>Input is validated: non-numeric tokens or non-positive dimensions cause a re-prompt.
 */
public class DDArrayRowAverageCalculator {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int rows = readPositiveInt("Enter the number of rows: ");
        int columns = readPositiveInt("Enter the number of columns: ");

        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = readDouble("Element at [" + i + "][" + j + "]: ");
            }
        }

        System.out.println("Averages of each row:");
        for (int i = 0; i < rows; i++) {
            double rowSum = 0.0;
            for (int j = 0; j < columns; j++) {
                rowSum += matrix[i][j];
            }
            double rowAverage = rowSum / columns;
            System.out.printf("Row %d: %.2f%n", i + 1, rowAverage);
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (SCANNER.hasNextInt()) {
                int value = SCANNER.nextInt();
                SCANNER.nextLine();
                return value;
            }
            System.out.println("Invalid input. Please enter a whole number.");
            SCANNER.next();
        }
    }

    private static int readPositiveInt(String prompt) {
        while (true) {
            int value = readInt(prompt);
            if (value > 0) {
                return value;
            }
            System.out.println("Size must be a positive integer.");
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (SCANNER.hasNextDouble()) {
                double value = SCANNER.nextDouble();
                SCANNER.nextLine();
                return value;
            }
            System.out.println("Invalid input. Please enter a number.");
            SCANNER.next();
        }
    }
}