package e0019_Operations_time_measure;

public class OperationsTimeMULL_AllTypes {
    public static void main(String[] args) {

        long start;
        long elapsed;

        long MAX = 1000000000L;

        byte B1 = 62;
        byte B2 = 72;
        int I1 = 5000;
        int I2 = 7000;
        short S1 = 1000;
        short S2 = 2000;
        long L1 = 5_000_000_000L;
        long L2 = 1_000_000_000L;
        float F1 = 400.032F;
        float F2 = 200.032F;
        double D1 = 2000.0047D;
        double D2 = 3000.0047D;
        long result = 0;

//        MulAndDiv mulAndDiv =

        start = System.nanoTime();
        MulAndDiv.multi(MAX, B1, B2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("multi byte x byte. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        MulAndDiv.multiShort(MAX, S1, S2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("multi short x short. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        MulAndDiv.multiInt(MAX, I1, I2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("multi int x int. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        MulAndDiv.multiLong(MAX, L1, L2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("multi long x long. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        MulAndDiv.multiFloat(MAX, F1, F2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("multi float x float. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        MulAndDiv.multiDouble(MAX, D1, D2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("multi double x double. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

//====== DIVIDI ========================================================================================================================
        start = System.nanoTime();
        MulAndDiv.dividi(MAX, B1, B2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("dividi byte x byte. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        MulAndDiv.dividiShort(MAX, S1, S2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("dividi short x short. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        MulAndDiv.dividiInt(MAX, I1, I2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("dividi int x int. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        MulAndDiv.dividiLong(MAX, L1, L2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("dividi long x long. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        MulAndDiv.dividiFloat(MAX, F1, F2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("dividi float x float. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        MulAndDiv.dividiDouble(MAX, D1, D2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("dividi double x double. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

    }
//===================================================================================================================================



//======================================================================================================


}

