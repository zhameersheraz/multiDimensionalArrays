import java.util.Scanner;

/**
 * Reads a 2D integer matrix of user-chosen size, then prints the sum of each row.
 *
 * <p>Input is validated: non-integer tokens or non-positive dimensions cause a re-prompt.
 */
public class DDArrayRowSumCalculator {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int rows = readPositiveInt("Enter the number of rows: ");
        int columns = readPositiveInt("Enter the number of columns: ");

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = readInt("Element at [" + i + "][" + j + "]: ");
            }
        }

        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < columns; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println(rowSum);
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
}