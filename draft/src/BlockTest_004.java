/* 
Продемонстрировать применение блока кода. 
Присвоить исходному файлу имя "BlockTest.java" 
*/ 

class BlockTest {
	public static void main(String args[]) {
		int x, y;

		y = 20;

		// адресатом этого оператора цикла служит блок кода
		for (x=0; x<10; x++) {
			System.out.println("Value of x: " + x);
			System.out.println("Value of y: " + y);

			y = y-2;
		}
	}
}