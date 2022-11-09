package e0033_Public_Private;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        ob.b = 400;
//        ob.d = 20;
//        ob.c = 100;

        ob.setd(600);
//        ob.setc(400);
        int summ = ob.calculate();
//        System.out.println("a, b, c, d: " + ob.a + " " + ob.b + " " + ob.c + " " + ob.getd());

    }
}
