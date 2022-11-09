package e0017_Arrays;

public class ArrayMulty {
    public static void main(String[] args) {
        double m[][] = {
                {11 * 55, 12 * 56, 13 * 57, 14 * 58},
                {21 * 65, 22 * 66, 23 * 67, 24 * 68},
                {31 * 75, 32 * 76, 33 * 77, 34 * 78},
                {41 * 85, 42 * 86, 43 * 87, 44 * 88}
        };

        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}
//