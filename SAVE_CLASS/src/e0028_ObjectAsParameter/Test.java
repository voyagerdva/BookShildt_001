package e0028_ObjectAsParameter;

class Test {
    int a;
    int b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test obj) {
        if (obj.a == a && obj.b == b) return true;
        else return false;
    }
}
//