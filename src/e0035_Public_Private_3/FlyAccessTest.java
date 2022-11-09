package e0035_Public_Private_3;

class FlyAccessTest {
    public static void main(String[] args) {
        Fly ob = new Fly();

        ob.a = 10;
        ob.b = 20;

//        ob.c = 100;
        ob.setC(100);

        System.out.println("a, b, c: " + ob.a + " " + ob.b + " " + ob.getC());
    }

}
//