package e0015_Shift_Right_and_Mask_ff;

public class ByteUShift {
    public static void main(String[] args) {
        char hex[] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
               '8', '9', 'а', 'b', 'с', 'd', 'е', 'f'
        };
        byte b = (byte) 0xf7;
        byte c = (byte) (b >> 4);
        byte d = (byte) (b >>> 4);
        byte e = (byte) ( (b & 0xff) >> 4);
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println("\n" + b);
        System.out.println(String.format("%32s", Integer.toBinaryString(b)));

        System.out.println("\nb >> 4 = 0x"  + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        System.out.println(String.format("%32s", Integer.toBinaryString(b >> 4)));

        System.out.println("\nb >>> 4 = 0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
        System.out.println(" (b & 0xff) >> 4 = 0x" + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
    }
}
