package Ejem05_CalculadoraComplejos.src;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ComplejoTest {

	Complejo c1,c2,resultado;
	
	
	public ComplejoTest(Complejo c1, Complejo c2, Complejo resultado) {
		super();
		
		this.c1=c1;
		this.c2=c2;
		this.resultado=resultado;
	}
 
	@Parameters
	public static ArrayList<Complejo[]> misValores(){
		ArrayList<Complejo[]> parametros = new ArrayList<Complejo[]>();
		
		Complejo c1=new Complejo(2, 3);
		Complejo c2=new Complejo(5, 9);
		Complejo resultado=new Complejo(7, 12);
		Complejo[] arrayComplejos=new Complejo[3];
		
		arrayComplejos[0]=c1;
		arrayComplejos[1]=c2;
		arrayComplejos[2]=resultado;
		
		parametros.add(arrayComplejos);
		
		return parametros;
	}
	@Test
	public void testSuma() {
		c2.suma(c1);  //Habría que probar el método suma si o si, es lo fundamental del testeo.
		
		Assert.assertEquals((Integer)resultado.getEntera(), (Integer)c2.getEntera());
		Assert.assertEquals((Integer)resultado.getReal(), (Integer)(c2.getReal()));
	
	    
	
	
	
	}
	

}
