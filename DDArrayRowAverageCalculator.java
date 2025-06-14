import java.util.Scanner;

public class DDArrayRowAverageCalculator {
    public static void main(String[] args) {

        Scanner average = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = average.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = average.nextInt();

        double [][] twoDecimal = new double [rows][columns];


        for(int i = 0; i < rows; i++) {
            for(int z = 0; z < columns; z++) {
                System.out.print("Element at ["+ i +"]["+ z +"]: ");

                twoDecimal[i][z] = average.nextDouble();
            }
        }


        System.out.println("Averages of each row: ");
        for(int i = 0; i < rows; i++) {
            double rowSum = 0;
            for(int z = 0; z < columns; z++) {
                rowSum += twoDecimal[i][z];
            }


            double rowAverage = rowSum / columns;
            System.out.printf("Row %d: %.2f%n", i + 1, rowAverage);

        }




    }
}