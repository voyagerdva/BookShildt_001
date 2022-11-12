package e0047_Args_Var_Length_OVERRIDE;

public class VarArgs4 {
    static void varTest(int... v) {
        System.out.print("varTest(int ...): " + "Args q-ty: " + v.length + " Contains: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void varTest(boolean... v) {
        System.out.print("varTest(boolean ...): " + "Args q-ty: " + v.length + " Contains: ");

        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void varTest(String msg, int... v) {
        System.out.print("varTest(String, int ...): " + msg + v.length + " Contains: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        varTest(1, 2, 3);
        varTest(true, false, false);
        varTest("Check match: ", 12, 15);
    }
}
