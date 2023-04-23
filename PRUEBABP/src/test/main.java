package test;

public class main {

	public static int[] ordenar(int[] numeros, boolean ascendente) {
	    if (numeros == null || numeros.length == 0) {
	        System.out.println("Error: el arreglo no puede ser nulo o vacío");
	        return null;
	    }
	    int n = numeros.length;
	    boolean intercambio = true;
	    for (int i = 0; i < n - 1 && intercambio; i++) {
	        intercambio = false;
	        for (int j = 0; j < n - i - 1; j++) {
	            if ((ascendente && numeros[j] > numeros[j+1]) || (!ascendente && numeros[j] < numeros[j+1])) {
	                int temp = numeros[j];
	                numeros[j] = numeros[j+1];
	                numeros[j+1] = temp;
	                intercambio = true;
	            }
	        }
	    }
	    return numeros;
	}


	public static void main(String[] args) {
	    int[] numeros = {5, 2, 9, 1, 3};
	    boolean ascendente = true;
	    
	    int[] numerosOrdenados = ordenar(numeros, ascendente);
	    
	    if (numerosOrdenados != null) {
	        System.out.println("Arreglo ordenado:");
	        for (int i = 0; i < numerosOrdenados.length; i++) {
	            System.out.print(numerosOrdenados[i] + " ");
	        }
	    }
	}


	// ALGORITMO BURBUJA
	// complejidad promedio de O(n^2)
}
