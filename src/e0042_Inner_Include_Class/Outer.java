package e0042_Inner_Include_Class;

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y = 10;
        void display() {
            System.out.println("OUTPUT: outer_x = " + outer_x);
        }
    }
}
