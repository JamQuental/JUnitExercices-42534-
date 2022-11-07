package QS_testTeste;

public class Sides {
	
	public float area(int base, int altura) {
		return base * altura;
	}
	
	public float perimeter(int base, int altura) {
		return base*2 + altura*2;
	}
	
	public boolean isTriangle(int a, int b, int c) {
		return a+b >c && b+c > a && c+a>b;
	}
}
