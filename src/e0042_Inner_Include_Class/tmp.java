package e0042_Inner_Include_Class;

class tmp {
    private int data;

    public tmp(int _data) {
        data = _data;
    }

    class MemberClass {
        public int getData() {
            return data;
        }
    }

    MemberClass getMemberClassInstance() {
        return new MemberClass();
    }
}