package test;
import org.junit.Assert;
import org.junit.Test;

	public class PruebaOrdenamiento {

	    @Test
	    public void pruebaOrdenamientoAscendente() {
	        int[] numeros = {5, 2, 9, 1, 5, 6};
	        int[] numerosOrdenados = OrdenamientoUtil.ordenar(numeros, true);
	        Assert.assertNotNull(numerosOrdenados);
	        Assert.assertEquals("La lista devuelta debe tener la misma longitud que la lista original", numeros.length, numerosOrdenados.length);
	        for (int i = 0; i < numerosOrdenados.length - 1; i++) {
	            Assert.assertTrue("La lista devuelta debe estar ordenada ascendentemente", numerosOrdenados[i] <= numerosOrdenados[i+1]);
	        }
	    }

	   // @Test
	    public void pruebaOrdenamientoDescendente() {
	        int[] numeros = {5, 2, 9, 1, 5, 6};
	        int[] numerosOrdenados = OrdenamientoUtil.ordenar(numeros, false);
	        Assert.assertNotNull(numerosOrdenados);
	        Assert.assertEquals("La lista devuelta debe tener la misma longitud que la lista original", numeros.length, numerosOrdenados.length);
	        for (int i = 0; i < numerosOrdenados.length - 1; i++) {
	            Assert.assertTrue("La lista devuelta debe estar ordenada descendentemente", numerosOrdenados[i] >= numerosOrdenados[i+1]);
	        }
	    }

	    //@Test
	    public void pruebaOrdenamientoListaVacia() {
	        int[] numeros = {};
	        int[] numerosOrdenados = OrdenamientoUtil.ordenar(numeros, true);
	        Assert.assertNull("La lista devuelta debe ser nula", numerosOrdenados);
	    }

	    //@Test
	    public void pruebaOrdenamientoListaNula() {
	        int[] numeros = null;
	        int[] numerosOrdenados = OrdenamientoUtil.ordenar(numeros, true);
	        Assert.assertNull("La lista devuelta debe ser nula", numerosOrdenados);
	    }

	}

	
	

