package e0036_Public_Private_4_Stack;

class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Stack is FULL");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack NOT FULL");
            return 0;
        }
        else
            return stck[tos--];
    }
}
