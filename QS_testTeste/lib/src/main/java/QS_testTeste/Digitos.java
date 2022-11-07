package QS_testTeste;

public class Digitos {
	
	public int media(int num) {
		int dig = 0;
		int soma = 0;
		int count = 0;
		while(num > 0) {
			dig = num % 10;
			num /= 10;
			soma+= dig;
			count++;
		}
		
		return soma/count;
		
	}

}
