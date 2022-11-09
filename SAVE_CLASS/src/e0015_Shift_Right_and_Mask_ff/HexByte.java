package e0015_Shift_Right_and_Mask_ff;

public class HexByte {
    public static void main(String[] args) {
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        byte b = (byte) 0xf1;
//        byte i = (byte) b;

        System.out.println("b = 0x" + hex[(b >> 3) & 0x0f] + hex[b & 0x0f]);
//        System.out.println(b);
//        System.out.println(String.format("%s", Integer.toBinaryString(b)));
//        System.out.println(String.format("%s", Integer.toBinaryString(b & 0xff)));
//        System.out.println(String.format("%s", Integer.toBinaryString(i)));

    }
}
