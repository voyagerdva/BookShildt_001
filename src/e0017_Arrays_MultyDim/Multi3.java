package e0017_Arrays_MultyDim;

import java.util.Arrays;

public class Multi3 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6, 7},
                null,
                {8, 9}
        };

        for (int[] ints :arr){
            System.out.println(Arrays.toString(ints));
        }
    }
}
