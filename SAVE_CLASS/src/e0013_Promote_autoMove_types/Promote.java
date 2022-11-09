package e0013_Promote_autoMove_types;

public class Promote {
    public static void main(String args[]) {
        byte b = 42;
        char c = 'а';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + "+(i / c) + "- "+(d * s));
        System.out.println("result = " + result);
        System.out.println("");

        byte bb = 50;
        bb = (byte)(bb * 2);
        System.out.println("byte b = 50 && b = (byte)(b * 2) --- " + bb);
    }
}
