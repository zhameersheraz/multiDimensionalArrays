import java.util.Scanner;


public class DDArrayInputAndPrint {
    public static void main(String[] args) {

        Scanner forday = new Scanner(System.in);


        System.out.print("Enter the number of rows: ");
        int rows = forday.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = forday.nextInt();


        int[][] array = new int[rows][columns];


        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < rows; i++) {
            for(int z = 0; z < columns; z++) {
                System.out.print("Element at ["+ i +"]["+ z +"]: ");
                array[i][z] = forday.nextInt();

            }
        }


        System.out.println("Elements of the array:");
        for(int i = 0; i < rows; i++) {
            for(int z = 0; z < columns; z++) {
                System.out.print(array[i][z] + " ");
            }

            System.out.println();
        }
    }
}