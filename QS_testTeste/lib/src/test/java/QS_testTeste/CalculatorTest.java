package QS_testTeste;




import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator calculator;
	
	@BeforeEach
	public void setUp() {
		calculator = new Calculator();
	}
	
	
	@Test
	@DisplayName("Teste soma")
	//@Disabled
	public void somaTest () {
		
		
		int num1 =5;
		int num2 =4;
		int soma = calculator.soma(num1, num2);
		assertEquals(9, soma, "deu erro rip");
		
	}
	
	//Posso utilizar assertTrue com (result == dif, "erro");
	
}
