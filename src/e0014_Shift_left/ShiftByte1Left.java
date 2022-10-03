package e0014_Shift_left;

public class ShiftByte1Left {
    public static void main(String[] args) {
//        byte a = 0b0100_0000;
//        System.out.println(String.format("%40s", String.format(%32s", Integer.toBinaryString(a))));
//
//        System.out.println(String.format("%40s", (byte) a << 1));
//        System.out.println(String.format("%40s", Integer.toBinaryString((byte) a << 1)));
        int AAA = 0b00111111_11111111_11111111_11111111;
//        System.out.println(String.format("%32s", Integer.toBinaryString(AAA)));
//        System.out.println(String.format("%32s", AAA));

        int BBB = AAA << 1;

        int CCC = AAA << 2;

        int DDD = AAA << 3;

        int EEE = AAA + BBB + CCC + DDD;

//        System.out.println(String.format("AAA = %32s", Integer.toBinaryString(AAA)));
//        System.out.println(String.format("%32s", AAA));
//        System.out.println(String.format("BBB = %32s", Integer.toBinaryString(BBB)));
//        System.out.println(String.format("%32s", BBB));
//        System.out.println(String.format("CCC = %32s", Integer.toBinaryString(CCC)));
//        System.out.println(String.format("%32s", CCC));
//        System.out.println(String.format("DDD = %32s", Integer.toBinaryString(DDD)));
//        System.out.println(String.format("%32s", DDD));
//        System.out.println(String.format("EEE = %32s", Integer.toBinaryString(EEE)));
//        System.out.println(String.format("%32s", EEE));

//        int num = 0xFFFFFFE;
//        System.out.println(num);
//        System.out.println(String.format("%32s", Integer.toBinaryString(num)));
//        for(i=0; i<4; i++) {
//            System.out.println(num);
//            num = num << 1;
//        }
//        System.out.println(String.format("%32s", Integer.toBinaryString(num)));

    }
}
