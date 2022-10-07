package e0017_Arrays_MultyDim;

import java.util.Arrays;

public class Multi4 {
    public static void main(String[] args) {

        int twoD[][][][] = new int[5][6][8][9];
//        twoD[0] = new int[9];
//        twoD[1] = new int[2];
//        twoD[2] = new int[8];
//        twoD[3] = new int[4];

        int i, j, k = 0;

//        for (i = 0; i < twoD.length; i++)
//            for (j = 0; j < (twoD[i].length); j++) {
//                twoD[i][j] = k;
//                k++;
//            }

        for (int[][][] ints : twoD) {
            System.out.println(Arrays.toString(ints));
        }


    }
}
