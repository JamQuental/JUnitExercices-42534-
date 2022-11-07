package QS_testTeste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SidesTest {
	
	@Test
	public void sidesTest() {
		Sides sides = new Sides();
		
		assertEquals(15, sides.area(3, 5), "Erro área 1");
		assertEquals(16, sides.perimeter(3, 5), "Erro perimetro 1");
		assertEquals(40, sides.area(5, 8), "Erro área 2");
		assertEquals(26, sides.perimeter(5, 8), "Erro perimetro 2");
		assertEquals(8, sides.area(2, 4), "Erro área 3");
		assertEquals(12, sides.perimeter(2, 4), "Erro perimetro 3");
		
		assertEquals(true, sides.isTriangle(10, 5, 3), "Não é triângulo");
		
		
	}
	

}
