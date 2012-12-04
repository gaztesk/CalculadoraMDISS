import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestCalculadora 
{
	
	private Calculadora calc;
	

	@Before
	public void setUp() throws Exception 
	{
		calc = new Calculadora();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSumar_5_6() 
	{
		int resultado = calc.sumar(5,6);
		assertEquals(11, resultado);
	}
	
	@Test
	public void testRestar_10_6() 
	{
		int resultado = calc.restar(10,6);
		assertEquals(4, resultado);
	}

}
