package e0019_Operations_time_measure;

public class OperationsTime {
    public static void main(String[] args) throws InterruptedException {

        long a = 0;
        long MAX = 1000000000L;
        long start;
        long elapsed;

        start = System.nanoTime();
        summ(a, MAX);
        elapsed = System.nanoTime() - start;
        System.out.println("Сумма обычная (a+1). Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        start = System.nanoTime();
        summInc(a, MAX);
        elapsed = System.nanoTime() - start;
        System.out.println("Сумма инкремент (a++). Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        byte m = 1;
        start = System.nanoTime();
        multiplByte(m, MAX);
        elapsed = System.nanoTime() - start;
        System.out.println("Умножение (m * 1). Средняя длительность одной итерации, нс: " + (double) elapsed / MAX);

        double d = 999999999999.0;
        int MAX_div = 10000000;
        start = System.nanoTime();
        dividi(d, MAX_div);
        elapsed = System.nanoTime() - start;
        System.out.println("Деление (d / 1.1). Средняя длительность одной итерации, нс: " + (double) elapsed / MAX_div);


    }

    static void summ(long a, long MAX) {
        for (long i = 0; i < MAX; i++) {
            a = a + 1;
        }
    }

    static void summInc(long a, long MAX) {
        for (long i = 0; i < MAX; i++) {
            a++;
        }
    }

    static void multiplByte(byte m, long MAX) {
        for (long i = 0; i < MAX; i++) {
            long res = m * 2;
        }
        System.out.println("\n    m = " + m);
    }

    static void dividi(double d, int MAX_div) {
        for (long i = 0; i < MAX_div; i++) {
            d = d / 1.1;
        }
        System.out.println("\n    d = " + d);
    }



}
//