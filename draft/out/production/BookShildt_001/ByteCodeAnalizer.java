package model;

public class ByteCodeAnalizer {
    byte[] byteCodeArray;
    ConstantInfo[] constantArray;

    public ByteCodeAnalizer (byte[] byteCodeArray) {
        this.byteCodeArray = byteCodeArray;
    }

    public void proccessAnaliz () {
        int constantCount = readConstantCount();
        constantArray = new ConstantInfo[constantCount];
        int byteArrayOffset = 10;
        for (int i = 0; i < constantCount; i++) {
            constantArray[i] = readConstantInfo(i, byteArrayOffset);
            byteArrayOffset += constantArray[i].lenthg;
        }
    }

    private ConstantInfo readConstantInfo (int number, int byteArrayOffset) {
        byte constantTypeCode = byteCodeArray[byteArrayOffset];
        int constantLength = calculateConstantLength(constantTypeCode, byteArrayOffset);
        ConstantInfo cnstInf = new ConstantInfo();
        cnstInf.lenthg = constantLength;
        cnstInf.type = constantTypeCode;
        cnstInf.number = number;
        cnstInf.address = byteArrayOffset;
        return cnstInf;
    }

    private int calculateConstantLength (byte constantTypeCode, int byteArrayOffset) {
        int length = 0;
        switch (constantTypeCode) {
            case 1: { //CONSTANT_Utf8
                int firstByte = byteCodeArray[byteArrayOffset + 1];
                int secondByte = byteCodeArray[byteArrayOffset + 2];
                int stringLength = firstByte * 256 + secondByte;
                length = length + 3 + stringLength;
                break;
            }
            case 7: { //CONSTANT_Class
                length = length + 5;
                break;
            }
            case 10: { //CONSTANT_Methodref
                length = length + 5;
                break;
            }
            case 16: { //CONSTANT_MethodType
                length = length + 3;
                break;
            }
            // TODO - допиши остальные типы
            default: {
                break;
            }
        }
        return length;
    }

    private int readConstantCount () {
        int firstByte = byteCodeArray[8];
        int secondByte = byteCodeArray[9];
        return firstByte * 256 + secondByte;
    }

    public class ConstantInfo {
        public int number;
        public int address;
        public byte type;
        public int lenthg;
    }
}
