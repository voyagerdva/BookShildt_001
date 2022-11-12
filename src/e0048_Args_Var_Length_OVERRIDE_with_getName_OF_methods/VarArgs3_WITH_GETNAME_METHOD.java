package e0048_Args_Var_Length_OVERRIDE_with_getName_OF_methods;

import java.lang.reflect.Method;

public class VarArgs3_WITH_GETNAME_METHOD {
    static void varTest(int... v) {
        System.out.println("\n1)----------------------");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.print("varTest(int ...): " + "Args q-ty: " + v.length + " Contains: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void varTest(boolean... v) {
        System.out.println("\n2)----------------------");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.print("varTest(boolean ...): " + "Args q-ty: " + v.length + " Contains: ");

        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void varTest(String msg, int... v) {
        System.out.println("\n3)----------------------");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.print("varTest(String, int ...): " + msg + v.length + " Contains: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        varTest(1, 2, 3);
        varTest("Check match: ", 12, 15);
        varTest(true, false, false);

//        System.out.println('\n' + VarArgs3.class.getDeclaredMethods()[0].getName());

        for (Method method : VarArgs3_WITH_GETNAME_METHOD.class.getDeclaredMethods()) {
            System.out.println(method.toString());
        }
    }
}
