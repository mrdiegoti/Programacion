public class SumaArrayBidimensional {
    public static void main(String[] args) {
        // Definir y declarar una matriz bidimensional
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Calcular la suma de los valores en la matriz
        int suma = calcularSumaMatriz(matriz);

        // Mostrar el resultado
        System.out.println("La suma de los valores en la matriz es: " + suma);
    }

    // Método para calcular la suma de los valores en una matriz bidimensional
    public static int calcularSumaMatriz(int[][] matriz) {
        int suma = 0;

        // Recorrer cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {
            // Recorrer cada columna de la fila actual
            for (int j = 0; j < matriz[i].length; j++) {
                // Sumar el valor actual al total
                suma += matriz[i][j];
            }
        }

        return suma;
    }
}
