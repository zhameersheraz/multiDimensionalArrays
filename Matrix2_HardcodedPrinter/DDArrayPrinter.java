/**
 * Prints a hard-coded 5x5 integer matrix in tabular form using tab-separated columns.
 *
 * <p>No user input is required - the matrix literal lives in the source as a constant.
 */
public class DDArrayPrinter {

    private static final int[][] GRID = {
            {  1,  2,  3,  4,  5 },
            {  6,  7,  8,  9, 10 },
            { 11, 12, 13, 14, 15 },
            { 16, 17, 18, 19, 20 },
            { 21, 22, 23, 24, 25 }
    };

    public static void main(String[] args) {
        for (int i = 0; i < GRID.length; i++) {
            for (int j = 0; j < GRID[i].length; j++) {
                System.out.print(GRID[i][j] + "\t");
            }
            System.out.println();
        }
    }
}