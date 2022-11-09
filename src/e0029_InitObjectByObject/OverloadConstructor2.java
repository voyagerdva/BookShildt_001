package e0029_InitObjectByObject;

public class OverloadConstructor2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("VOLUME mybox1 EQAULS = " + vol);

        vol = mybox2.volume();
        System.out.println("VOLUME mybox2 EQAULS = " + vol);

        vol = mycube.volume();
        System.out.println("VOLUME OF CUBE EQAULS = " + vol);

        vol = myclone.volume();
        System.out.println("VOLUME CLONE EQAULS = " + vol);
    }
}
//