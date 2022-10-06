package e0017_Arrays;

import java.util.Arrays;

public class Array_Average {
    public static void main(String[] args) {
        // array of primitives:
        int[] intArray = new int[] {1, 2, 3, 4, 5};
        //output: [1, 2, 3, 4, 5]

        // array of object references:
        String[] strArray = new String[] {"John", "Mary", "Bob"};
        //output: [John, Mary, Bob]
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.asList(strArray));

        String[][] deepArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};
        System.out.println(Arrays.asList(deepArray));
//output: [[Ljava.lang.String;@106d69c, [Ljava.lang.String;@52e922]
        System.out.println(Arrays.deepToString(deepArray));

        String[] greeting = {"Hey", "there", "amigo!"};
        String delimiter = " ";
        String.join(delimiter, greeting);
    }
}
