import java.util.Scanner;

/**
 * Reads two same-sized 2D integer matrices and counts the cells whose values differ.
 *
 * <p>Input is validated: non-integer tokens, non-positive dimensions, or mismatched
 * matrix sizes cause a re-prompt or an informative message.
 */
public class MatrixDifferencesCounter {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int rows = readPositiveInt("Enter the number of rows: ");
        int columns = readPositiveInt("Enter the number of columns: ");

        System.out.println("Enter the elements of the first array:");
        int[][] matrixA = readMatrix(rows, columns, "first");

        System.out.println("Enter the elements of the second array:");
        int[][] matrixB = readMatrix(rows, columns, "second");

        int differences = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrixA[i][j] != matrixB[i][j]) {
                    differences++;
                }
            }
        }
        System.out.println("Number of differences between the two matrices: " + differences);
    }

    private static int[][] readMatrix(int rows, int columns, String label) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = readInt(
                        String.format("Element at [%d][%d] (%s): ", i, j, label));
            }
        }
        return matrix;
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