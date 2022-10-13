/* 
	Продемонстрировать применение цикла for.
	Присвоить исходному файлу имя "Forтest.java"
*/ 

class ForTest {
	public static void main(String args[]) {
		int x;

		for (x = 0; x < 10; x = x+1)
			System.out.println("Value of x: " + x);
	}
}