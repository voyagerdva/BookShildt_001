package e0026_CLASSES_Colors;

public class Black {
    float BB1;
    float BB2;
    float BB3;

    Black() {
        System.out.println("Run Black constructor!!!");
    }

    void createInstance() {
        createInstanceRed();
    }

    void createInstanceRed() {
        Red myred = new Red();
        myred.createInstance();
    }

    void countFloatRed() {
        float BB;
        Red myred = new Red();

        BB = myred.floatRedNumber() * myred.floatRedNumber();
        System.out.println("BB floatNumber ^ 2 =" + BB);
    }

    void blackVolume() {
        System.out.println("METHOD blackVolume");
    }

}
