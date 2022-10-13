/* 
	Продемонстрировать применение условного оператора if. 
	Присвоить исходному файлу имя "IfSample.java" 
*/ 

class ifSample {
	public static void main(String args[]) {
		int x, y;

		x = 10;
		y = 20;

		if (x < y) System.out.println("x less then y");

		x = x * 2;
		if (x == y) System.out.println("x now equals y");

		x = x * 2;
		if (x > y) System.out.println("x now more then y");

		// этот оператор не будет ничего выводить
		if (x == y) System.out.println("You will not see this output");
	}
}