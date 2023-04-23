package test;

public class OrdenamientoUtil {

	public static int[] ordenar(int[] numeros, boolean ascendente) {
	    if (numeros == null || numeros.length == 0) {
	        System.out.println("Error: el arreglo no puede ser nulo o vacio");
	        return null;
	    }
	    quicksort(numeros, 0, numeros.length - 1, ascendente);
	    return numeros;
	}

	private static void quicksort(int[] numeros, int izquierda, int derecha, boolean ascendente) {
	    if (izquierda < derecha) {
	        int particion = particionar(numeros, izquierda, derecha, ascendente);
	        quicksort(numeros, izquierda, particion - 1, ascendente);
	        quicksort(numeros, particion + 1, derecha, ascendente);
	    }
	}

	private static int particionar(int[] numeros, int izquierda, int derecha, boolean ascendente) {
	    int pivote = numeros[derecha];
	    int i = izquierda - 1;
	    for (int j = izquierda; j <= derecha - 1; j++) {
	        if ((ascendente && numeros[j] <= pivote) || (!ascendente && numeros[j] >= pivote)) {
	            i++;
	            int temp = numeros[i];
	            numeros[i] = numeros[j];
	            numeros[j] = temp;
	        }
	    }
	    int temp = numeros[i+1];
	    numeros[i+1] = numeros[derecha];
	    numeros[derecha] = temp;
	    return i + 1;
	}



	public static void main(String[] args) {
	    int[] numeros = {5, 2, 9, 1, 3,};
	    boolean ascendente = true;
	    
	    int[] numerosOrdenados = ordenar(numeros, ascendente);
	    
	    if (numerosOrdenados != null) {
	        System.out.println("Arreglo ordenado:");
	        for (int i = 0; i < numerosOrdenados.length; i++) {
	            System.out.print(numerosOrdenados[i] + " ");
	        }
	    }
	
	
}
}