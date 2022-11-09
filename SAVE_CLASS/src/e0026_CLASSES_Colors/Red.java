package e0026_CLASSES_Colors;

public class Red {
    float RR1;
    float RR2;
    float RR3;

    Red() {
        System.out.println("Run Red constructor!!!");
    }


    void createInstance() {
        createInstanceYellow();
    }

    float floatRedNumber() {
        float RR = 412.65F;
        return RR;
    }

    void createInstanceYellow() {
        Yellow myyellow = new Yellow();
        myyellow.yellowFall();
    }

    void blackVolume() {
        System.out.println("METHOD blackVolume");
    }
}
