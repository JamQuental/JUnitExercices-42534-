package QS_testTeste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DigitosTest {
	Digitos digitos;
	@BeforeEach
	public void setup() {
		digitos = new Digitos();
	}
	
	@Test
	public void digitotest() {
		assertEquals(30000, digitos.media(123), "Não calculou média corretamente");
	}

}
