import java.util.Arrays;

public class BidimentioalArray {
    public static void main(String[] args) {
        int[][] arrayBi = {
                {4, 6, 5},
                {8, 9, 10},
                {4, 6, 7},
                {1, 4, 8}
        };
        System.out.println(Arrays.toString(notaMediaIndividual(arrayBi)));
        System.out.println(Arrays.toString(new double[]{notaMediaGlobal(arrayBi)}));
        System.out.println(Arrays.toString(new int[]{notaMaxima(arrayBi)}));
    }

    public static double[] notaMediaIndividual(int[][] arrayBi) {
        double[] media = new double[arrayBi[0].length];
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                media[j] += arrayBi[i][j];
            }
        }
        for (int i = 0; i < media.length; i++) {
            media[i] /= arrayBi.length;
        }
        return media;
    }

    public static double notaMediaGlobal(int[][] arrayBi) {
        double sum = 0;
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                sum += arrayBi[i][j];
            }
        }
        return sum / 12;
    }

    public static int notaMaxima(int[][] arrayBi) {
        int max = 0;
        for (int i = 0; i < arrayBi.length - 1; i++) {
            for (int j = 0; j < arrayBi[i].length - 1; j++) {
                max = Math.max(arrayBi[i][j], arrayBi[j][i]);
            }
        }
        return max;
    }
}
