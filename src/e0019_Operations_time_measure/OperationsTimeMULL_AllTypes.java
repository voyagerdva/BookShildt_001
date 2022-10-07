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

        start = System.nanoTime();
        multi(MAX, B1, B2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("multi byte x byte. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        multiShort(MAX, S1, S2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("multi short x short. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        multiInt(MAX, I1, I2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("multi int x int. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        multiLong(MAX, L1, L2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("multi long x long. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        multiFloat(MAX, F1, F2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("multi float x float. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        multiDouble(MAX, D1, D2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("multi double x double. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

//====== DIVIDI ========================================================================================================================
        start = System.nanoTime();
        dividi(MAX, B1, B2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("dividi byte x byte. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        dividiShort(MAX, S1, S2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("dividi short x short. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        dividiInt(MAX, I1, I2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("dividi int x int. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        dividiLong(MAX, L1, L2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("dividi long x long. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        dividiFloat(MAX, F1, F2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("dividi float x float. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        dividiDouble(MAX, D1, D2, result);
        elapsed = System.nanoTime() - start;
        System.out.println("dividi double x double. Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);
//===================================================================================================================================

    }

    private static void multi(long max, byte b1, byte b2, long result) {
        for (long i = 0; i < max; i++) {
            result = b1 * b2;
        }
        System.out.println("\n    result = " + result);
    }

    private static void multiShort(long max, short b1, short b2, long result) {
        for (long i = 0; i < max; i++) {
            result = b1 * b2;
        }
        System.out.println("\n    result = " + result);
    }

    private static void multiInt(long max, int b1, int b2, long result) {
        for (long i = 0; i < max; i++) {
            result = b1 * b2;
        }
        System.out.println("\n    result = " + result);
    }

    private static void multiLong(long max, long b1, long b2, long result) {
        for (long i = 0; i < max; i++) {
            result = b1 * b2;
        }
        System.out.println("\n    result = " + result);
    }

    private static void multiFloat(long max, float b1, float b2, float result) {
        for (long i = 0; i < max; i++) {
            result = b1 * b2;
        }
        System.out.println("\n    result = " + result);
    }

    private static void multiDouble(long max, double b1, double b2, double result) {
        for (long i = 0; i < max; i++) {
            result = b1 * b2;
        }
        System.out.println("\n    result = " + result);
    }

// ======= DIVIDI ==========================================================================================
    private static void dividi(long max, byte b1, byte b2, long result) {
        for (long i = 0; i < max; i++) {
            result = b1 / b2;
        }
        System.out.println("\n    result = " + result);
    }

    private static void dividiShort(long max, short b1, short b2, long result) {
        for (long i = 0; i < max; i++) {
            result = b1 / b2;
        }
        System.out.println("\n    result = " + result);
    }

    private static void dividiInt(long max, int b1, int b2, long result) {
        for (long i = 0; i < max; i++) {
            result = b1 / b2;
        }
        System.out.println("\n    result = " + result);
    }

    private static void dividiLong(long max, long b1, long b2, long result) {
        for (long i = 0; i < max; i++) {
            result = b1 / b2;
        }
        System.out.println("\n    result = " + result);
    }

    private static void dividiFloat(long max, float b1, float b2, float result) {
        for (long i = 0; i < max; i++) {
            result = b1 / b2;
        }
        System.out.println("\n    result = " + result);
    }

    private static void dividiDouble(long max, double b1, double b2, double result) {
        for (long i = 0; i < max; i++) {
            result = b1 / b2;
        }
        System.out.println("\n    result = " + result);
    }


//======================================================================================================


}

