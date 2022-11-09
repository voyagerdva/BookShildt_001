package e0027_OverloadMethods;

public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    void test(int a, int b) {
        System.out.println("a & b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове "+ "test(double) a: " + a);
    }
}
