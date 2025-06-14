import java.util.Scanner;

public class DDArrayPrinter {
    public static void main(String[] args) {

        Scanner today = new Scanner(System.in);


        int[][] noIdea = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        for(int i = 0; i < noIdea.length; i++) {
            for(int z = 0; z < noIdea[i].length; z++) {
                System.out.print(noIdea[i][z] + "\t");
            }

            System.out.println();

        }

    }
}