package e0014_Shift_left;

public class ShiftLeftPositiveByte {
    public static void main(String[] args) {
//        byte a = 63;
//        byte a = 0b0100_0000;
//        System.out.println(a << 2);
//        System.out.printf("(byte) a << 2:%32s\n", Integer.toBinaryString((byte) a << 2));
//        System.out.printf("a << 2       :%32s\n", Integer.toBinaryString(a << 2));
//        System.out.printf("%32s\n", Integer.toBinaryString(a));


//        int x = 342;
//        System.out.println(Integer.toBinaryString(~x));
        byte a = 0b0100_0000, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2 );
        System.out.println("Пepвoнaчaльнoe значение а: " + a);
        System.out.printf("\n(byte) a << 2:%s\n", Integer.toBinaryString((byte) a << 2));
        System.out.printf("\n(byte) (a << 2):%s\n", Integer.toBinaryString((byte) (a << 2)));

        System.out.println("\ni and b: " + i + " " + b);
        System.out.printf("\ni = a << 2           : %s", Integer.toBinaryString(i));
        System.out.printf("\nb = (byte) (a << 2 ) (bin): %32s", Integer.toBinaryString(b));
        System.out.printf("\nb = (byte) (a << 2 ) (dec): %32s", b);

        System.out.printf("\na << 2       :%32s\n", Integer.toBinaryString(a << 2));
        System.out.printf("%32s\n", Integer.toBinaryString(a));

    }

}
