package e0043_Inner_Include_Class_IN_FOR;

public class Outer43 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display () {
                    System.out.println("OUT: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
