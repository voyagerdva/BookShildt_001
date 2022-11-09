package e0030_LinkOrValueArgument;

public class Test1 {
    int a;
    int b;

    Test1(int i, int j) {
        a = j;
        b = j;
    }

    void meth(Test1 o) {
        o.a *= 2;
        o.b /= 2;
    }
}
