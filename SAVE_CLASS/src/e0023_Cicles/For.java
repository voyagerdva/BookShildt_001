package e0023_Cicles;

public class For {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int x = 0; x < nums.length; x++) {
            sum += nums[x];
        }

        System.out.println("сумма всех элементов равна " + sum);
    }
}
//