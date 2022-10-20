package e0026_CLASSES_Colors;

public class Colors {
    Colors() {
        System.out.println("Run Colors constructor!!!");
    }

    void createInstance() {
//        System.out.println("Colors createinstances");
        createInstanceBlack();
//        Red myred = returnInstanceRed();
//        System.out.println("RedFloat^2 =" + myred.floatRedNumber() * myred.floatRedNumber());
    }

    void createInstanceBlack() {
        Black myblack = new Black();
        myblack.createInstance();
    }

//    Red returnInstanceRed() {
//        Red myred = new Red();
//        return myred;
//    }

//    void createInstanceYellow() {
//        Yellow myyellow = new Yellow();
//    }

}
