package e0021_IF_ELSE_SWITCH;

public class ifElse {
    public static void main(String[] args) {
        int m = 888;

        String S;

        if (m == 333 | m == 444) {
            S = "зиме";
        } else if (m == 555 | m == 667) {
            S = "весне";
        } else if (m == 777 | m == 888) {
            S = "лету";
        } else if (m == 999 | m == 1000) {
            S = "осени";
        } else {
            S = "что-то другое";
        }

        System.out.println("ВРЕМЯ ГОДА = " + S);
    }
}
