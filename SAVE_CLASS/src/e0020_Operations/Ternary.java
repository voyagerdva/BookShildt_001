package e0020_Operations;

public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
//        k = i < 0 ? -i : i;

        if (i < 0) {
            k = -i;
        } else {
            k = i;
        }
        System.out.println(i + " ravno " + k) ;
    }
}
