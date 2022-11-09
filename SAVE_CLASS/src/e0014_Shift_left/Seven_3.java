package e0014_Shift_left;

public class Seven_3 {
    public static void main(String[] args) {
        short BB = -7;
        int II = BB << 1;

        System.out.println(String.format("II = %32s", Integer.toBinaryString(II)));
        System.out.println(String.format("%32s", II));

        int JJ = BB << 2;
        System.out.println(String.format("JJ = %32s", Integer.toBinaryString(JJ)));
        System.out.println(String.format("%32s", JJ));

        int LL = BB << 3;
        System.out.println(String.format("LL = %32s", Integer.toBinaryString(LL)));
        System.out.println(String.format("%32s", LL));
    }
}
