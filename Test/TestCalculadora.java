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
	
	@Test
	public void testDividir_10_2() 
	{
		float resultado = calc.dividir(10,2);
		assertEquals(5,0, resultado);
	}
	
	@Test
	public void testDividir0() 
	{
		try
		{
			calc.dividir(10,0);
			fail(ArithmeticException.class.getName()+"_expected");
		}
		catch(ArithmeticException e)
		{
			//ok
		}
	}
	
	@Test
	public void testLog10_10() 
	{
		double resultado = calc.log10(10);
		//Los doubles no se pueden comparar sin esta estructura
		assertEquals(Double.doubleToLongBits(1), Double.doubleToLongBits(resultado));
	}
	
	@Test
	public void testlogNeperiano_10() 
	{
		double resultado = calc.logNeperiano(1);
		//Los doubles no se pueden comparar sin esta estructura
		assertEquals(Double.doubleToLongBits(0), Double.doubleToLongBits(resultado));
	}
	
	

}
