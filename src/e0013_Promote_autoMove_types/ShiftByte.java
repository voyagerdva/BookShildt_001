package e0013_Promote_autoMove_types;

public class ShiftByte {
    public static void main(String[] args) {
        System.out.println(shiftByte(5));
        System.out.println(method_111(5, 126000 << 5));

        Shift2 shift2 = new Shift2();
        shift2.method_111((byte) 5, 126000);
    }

    private static int shiftByte(int f) {
        byte a = 126;
        int b = a << f;
        return b;
    }

    private static int method_111(int f, int g) {
        int b = g << f;
        return b;
    }

//        String str1 = String.format("a << 2 (bin) = %8s", (a << 2));//.replace(' ', '0');
//        System.out.println(str1 + " ");
//        if((a << 2) instanceof Integer) System.out.println("yes");
//        return (a << 2);

//        String str1 = String.format("a << 2 (bin) = %8s", Integer.toBinaryString(a << 2));//.replace(' ', '0');
//
//        b = (byte) (a << 2);
//        String str2 = String.format("b
//        bin = %8s", Integer.toBinaryString(b));//.replace(' ', '0');
//        System.out.println(str2 + " ");

//        if ((a << 2) instanceof Integer)
//            System.out.println("Integer ");
//        else if((a << 2) instanceof Double);

}
