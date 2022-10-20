package e0024_CLASSES_1;

class Box {

    double width;
    double height;
    double depth;

    Red red1;
    Red red2;

    public Box() {
        super();
        red1 = new Red();
        red2 = new Red();
    }

}

class Red {
    double Depth;
    double Depth2;
    double Depth3;
    double Depth4;
    double Depth5;

}


public class BoxDemo {
    public static void main(String[] args) {
        Red r1;

        for (int i = 0; i < 1000000; i++) {
            Box mybox1;

            mybox1 = new Box();
            r1 = mybox1.red1;
            mybox1.width = 10;
        }

    }
}