import java.util.Scanner;

public class matrixDifferencesEncounter {
    public static void main(String[] args) {

        Scanner matrix = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = matrix.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = matrix.nextInt();

        int[][] array1 = new int[rows][columns];
        int[][] array2 = new int[rows][columns];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array1[i][j] = matrix.nextInt();
            }
        }

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array2[i][j] = matrix.nextInt();
            }
        }

        int differences = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(array1[i][j] != array2[i][j]) {
                    differences++;
                }
            }
        }

        System.out.println("Number of differences between the two matrices: " + differences);

    }
}