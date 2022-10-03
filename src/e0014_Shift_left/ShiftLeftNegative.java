package e0014_Shift_left;

public class ShiftLeftNegative {
    public static void main(String[] args) {
        byte a = -0b111;
        int b = a * (a << 2);
        int c = a * (b << 3);

        int d = a * b * c;

//        System.out.println(d);
//        System.out.println(String.format("%40s", Integer.toBinaryString(a)).replace(" ", "."));
//        System.out.println(a << 2);
//        System.out.println(String.format("%40s", Integer.toBinaryString(a << 2)).replace(" ", "."));
//
//
//        System.out.printf("%40s\n", Integer.toBinaryString((byte) a << 2));
//        System.out.printf("%40s\n", a << 4);
//
//        int b1 = 0b11111111111111111111111111111001; // -7
//        System.out.println(b1); // -7
//        int b2 = -0b11111111111111111111111111111001; // 7
//        System.out.println(b2); // 7
//        int b3 = 0b0111111111111111111111111111110;    // 2_147_483_641
//        System.out.println(b3);
    }
}
