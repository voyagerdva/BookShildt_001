package model;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ByteCodePrintDemo {
    public static final int COLUMN_NUMBER = 8;
    private static String SEMI_COLUMN_SPACE = "  ";
    private static String SIGN_SPACE = "  ";
    private static String BYTES_SPACE = "    ";

    public static void main(String[] args) {
        byte[] byteCodeArray = readFileToByteArray("e://__PROJECT__//JAVA//BookShildt_001//out//production//BookShildt_001//e0011_DinamicInitialization//DynInit.class");
        System.out.println("");
        printHeader();
        printByteHexArray(byteCodeArray);
        System.out.println("");
    }

    private static byte[] readFileToByteArray (String fileName) {
        Path path = Paths.get(fileName);
        try {
            return Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void printByteHexArray (byte[] b) {
        AtomicInteger index = new AtomicInteger();
        IntStream.range(0, b.length).forEach(i->{
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%2s", Integer.toHexString(b[i] & 0xFF)).replace(' ', '0'));
            if(index.get() % 2 != 0){
                sb.append(SEMI_COLUMN_SPACE);
                sb.append(SIGN_SPACE);
                sb.append(SEMI_COLUMN_SPACE);
            }
            if(index.get() != 0 && (index.get() + 1) % (COLUMN_NUMBER*2) == 0){
                sb.append("\n");
            }
            System.out.print(sb.toString());
            index.getAndIncrement();
        });
    }

    private static void printHeader () {
        System.out.print(SEMI_COLUMN_SPACE + 0);
        IntStream.range(1, COLUMN_NUMBER).forEach(i->{
            String number = String.format("%4d", i).substring(4-SIGN_SPACE.length(), 4);
            System.out.print(SEMI_COLUMN_SPACE + BYTES_SPACE + SEMI_COLUMN_SPACE + number);
        });
        System.out.println("");
    }

}
