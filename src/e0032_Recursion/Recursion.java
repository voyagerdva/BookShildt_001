package e0032_Recursion;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        int res = f.fact(3);
        System.out.println("FACTORIAL 3 equals: " + res);

        int res1 = f.fact(4);
        System.out.println("FACTORIAL 4 equals: " + res1);

        int res2 = f.fact(5);
        System.out.println("FACTORIAL 5 equals: " + res2);
    }
}
