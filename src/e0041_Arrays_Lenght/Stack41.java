package e0041_Arrays_Lenght;

public class Stack41 {
    private int stck[];
    private int tos;

    Stack41(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is full !!!");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack it EMPTY !!!");
            return 0;
        } else {
            return stck[tos--];
        }

    }
}
