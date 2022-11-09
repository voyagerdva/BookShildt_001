package e0022_Switch;

public class SampleSwitch {
    public static void main(String[] args) {
        int i = 250;
//        int j;

        switch (i) {
            case 200:
                System.out.println("i = 200");
                break;
            case 250:
                int j = 1100;
                switch (j) {
                    case 1000:
                        System.out.println("j равно 1000");
                        break;
                    case 1100:
                        System.out.println("j равно 1100");
                        break;
                    case 1200:
                        System.out.println("j равно 1200");
                        break;
                }
                break;
            case 300:
                System.out.println("i = 300");
                break;
            case 350:
                System.out.println("i = 350");
                break;
            default:
                System.out.println("i больше 351");
        }
    }
}
//