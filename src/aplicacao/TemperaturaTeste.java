package aplicacao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemperaturaTeste {
	Temperatura temperatura;

	@BeforeEach
	void setUp() throws Exception {
		temperatura = new Temperatura();
	}

	@Test
	void testCelsiusParaFarenheit() {
		assertEquals("CASO 1", 23, temperatura.celsiusParaFarenheit(-5), 0);
		assertEquals("CASO 2", 32, temperatura.celsiusParaFarenheit(0), 0);
		assertEquals("CASO 3", 64.40, temperatura.celsiusParaFarenheit(18), 0);
	}

	@Test
	void testCelsiusParaKelvin() {
		assertEquals("CASO 4", 268.150, temperatura.celsiusParaKelvin((-5)), 0);
		assertEquals("CASO 5", 273.150, temperatura.celsiusParaKelvin((0)), 0);
		assertEquals("CASO 6", 291.150, temperatura.celsiusParaKelvin((18)), 0);
	}

	@Test
	void testClassificaTemperatura() {
		assertTrue("CASO 7", "NEGATIVA" == temperatura.classificaTemperatura(-5));
		assertTrue("CASO 8", "ZERO" == temperatura.classificaTemperatura(0));
		assertTrue("CASO 9", "POSITIVA" == temperatura.classificaTemperatura(18));
	}

	@Test
	void testValidaConversaoCelsiusFarenheit() {
		assertTrue("CASO 10", true == temperatura.validaConversaoCelsiusFarenheit(-5, 23));
	}

}
