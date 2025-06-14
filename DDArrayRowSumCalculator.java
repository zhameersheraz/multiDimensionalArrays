import java.util.Scanner;


public class DDArrayRowSumCalculator {
    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = calculator.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = calculator.nextInt();


        int[][] sumArr = new int[rows][columns];


        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print("Element at ["+ i +"]["+ j +"]: ");
                sumArr[i][j] = calculator.nextInt();

            }
        }

        System.out.println("Sum of each row: ");
        for(int i = 0; i < rows; i++) {
            int rowSum = 0;
            for(int j = 0; j < columns; j++) {
                rowSum += sumArr[i][j];
            }

            System.out.println(rowSum);

        }



    }
}