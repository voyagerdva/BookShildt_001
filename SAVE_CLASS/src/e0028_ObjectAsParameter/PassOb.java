package e0028_ObjectAsParameter;

public class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        boolean o1 = ob1.equalTo(ob2);
        boolean o2 = ob1.equalTo(ob3);

        System.out.println("ob1 == ob2: " + o1);
        System.out.println("ob1 == ob3: " + o2);
    }
}
//