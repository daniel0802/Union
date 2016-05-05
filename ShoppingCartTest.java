import static org.junit.Assert.*;

import java.util.ArrayList;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ShoppingCartTest {
	

	 double precio_total;
	 ShoppingCart carrito;


	public ShoppingCartTest(Product[] pr, double d) {
		
		carrito = new ShoppingCart();
		
		for(Product pr1: pr){
			carrito.addItem(pr1);
		}
		precio_total=d;
	}
	
	@Parameters
	public static ArrayList<Object []> metodoParametrizado() {
		
		ArrayList<Object []> lista=new ArrayList<Object[]>();
		Product p1 = new Product("Leche", 2);
		Product p2 = new Product ("Galletas",3);
		Product p3 = new Product ("Pan", 1);
		Object[]prod = new Object[2]; 
		prod[0]=new Product[]{p1,p2,p3};		
		prod[1] = 6.0;
		lista.add(prod);
	
	
		
		
		return lista;
		
	}
	


	
	

	@Test
	public void testSize() {
		
		Assert.assertEquals((Integer)3,(Integer)carrito.getItemCount());
		
	}

}
