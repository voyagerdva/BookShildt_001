package e0031_ReturnObjects;

import javax.security.auth.login.CredentialNotFoundException;

public class Test2 {
    int a;

    Test2(int i) {
        a = i;
    }

    Test2 incrByTen() {
        Test2 temp = new Test2(a + 10);
        return temp;
    }
}
