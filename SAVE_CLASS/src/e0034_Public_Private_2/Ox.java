package e0034_Public_Private_2;

public class Ox {
    public Rat rat1 = new Rat();
    private Rat rat2 = new Rat();

    void modifyRatAAA(Rat R1, Rat R2) {
        rat1 = R1;
        rat2 = R2;
    }

    public void runRat() {
        modifyRatAAA(rat1, rat2);
    }
}
//