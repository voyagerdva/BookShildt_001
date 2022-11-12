package e0046_Args_Var_Length;

public class PassArrayTrainer {
    static void varTest(int ... vvv) {
        System.out.println(vvv);
    }

    static void fixTest(int NNN) {
        System.out.println(NNN);
    }

    public static void main(String[] args) {
        varTest(10);
        varTest(7,9,11);
        varTest();
        System.out.println("---------");
        fixTest(20);
        fixTest(30);
        fixTest(40);

    }
}
