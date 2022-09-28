package e0010_Boolean;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b EQUAL " + b);

        b = true;
        System.out.println("b EQUAL " + b);

        if(b) System.out.println("IT WILL BE DO");
        b = false;
        if(b) System.out.println("IT WILL NOT BE DO NOT");

        System.out.println("10 > 9 EQUAL " + (10 > 9));
    }
}
