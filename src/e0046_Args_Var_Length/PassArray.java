package e0046_Args_Var_Length;

public class PassArray {
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length + " Contains: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("First param var length: ", 10);
        vaTest("Second param var length: ", 20, 25, 29);
        vaTest("Third param var length: ");
        System.out.println("---------");
    }
}
