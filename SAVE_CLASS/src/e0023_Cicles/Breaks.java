package e0023_Cicles;

public class Breaks {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            System.out.println("1 - block first");
            second: {
                System.out.println("2 - block second");
                third: {
                    System.out.println("3 - block third. Предшествует оператору break");
                    if (t) {
                        break second;
                    }
                    System.out.println("3 - block third - end. Этот оператор не будет выполняться");
                }
                System.out.println("2 - block second - end. Этот оператор не будет выполняться");
            }
            System.out.println("1 - block first - end. Этот оператор следует за блоком second");
        }
    }
}
//