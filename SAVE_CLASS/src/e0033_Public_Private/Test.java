package e0033_Public_Private;

public class Test {
    int a = 300;
    int b;
    private int c = 400;
    private int d;

    public int calculate() {
        int summ = a + b + c + d;
        return summ;
    }

    void setd(int i) {
        d = i;
    }

    int getd() {
        return d;
    }
//
//    void setb(int i) {
//        b = i;
//    }
//
//    int getb() {
//        return b;
//    }


}
