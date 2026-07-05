import java.util.Scanner;

/**
 * Reads a 2D integer matrix of user-chosen size, then prints it.
 *
 * <p>Prompts for {@code rows} and {@code columns}, fills the matrix element by element
 * via standard input, and prints the result row by row separated by single spaces.
 *
 * <p>Input is validated: any non-integer token causes a re-prompt rather than a crash.
 */
public class DDArrayInputAndPrint {

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

        System.out.println("Elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (SCANNER.hasNextInt()) {
                int value = SCANNER.nextInt();
                SCANNER.nextLine(); // consume trailing newline
                return value;
            }
            System.out.println("Invalid input. Please enter a whole number.");
            SCANNER.next(); // discard invalid token
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