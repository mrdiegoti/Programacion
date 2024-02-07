import java.util.Arrays;

public class SalesAnalytics {
    public static void main(String[] args) {
        int[][] producto = {
                {4, 6, 5, 4, 6, 5, 4, 6, 5, 4, 6, 5},
                {8, 9, 10, 8, 9, 10, 8, 9, 10, 8, 9, 10},
                {2, 6, 7, 2, 6, 7, 2, 6, 7, 2, 6, 7}
        };
        System.out.println("Total sales are: " + calculateTotalSales(producto));
        int[] totalSalesPerProduct = calculateTotalSalesPerProduct(producto);
        for (int element: totalSalesPerProduct){
            System.out.print(element + " ");
        }
        System.out.println();
        int[] totalSalesPerMonth = calculateTotalSalesPerMonth(producto);
        for (int element: totalSalesPerMonth){
            System.out.print(element + " ");
        }
        System.out.println();
        double[] AverageMonthlySales = calculateAverageMonthlySales(producto);
        for (double element: AverageMonthlySales){
            System.out.print(element + " ");
        }    }

    private static double[] calculateAverageMonthlySales(int[][] array)  {
        double[] averageSalesPerMonth = new double[array[0].length];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                averageSalesPerMonth[j] += array[i][j];
            }
        }
        for (int i = 0; i < averageSalesPerMonth.length; i++){
            averageSalesPerMonth[i] /= array.length;
        }
        return averageSalesPerMonth;
    }

    private static int[] calculateTotalSalesPerMonth(int[][] array) {
        int[] salesPerMonth = new int[array[0].length];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                salesPerMonth[j] += array[i][j];
            }
        }
        return salesPerMonth;
    }

    public static int calculateTotalSales(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
        }
        return sum;
    }
   public static int[] calculateTotalSalesPerProduct(int[][] array){
        int[] salesPerProduct = new int[array.length];
       for (int i = 0; i < array.length; i++){
           for (int j = 0; j < array[i].length; j++){
               salesPerProduct[i] += array[i][j];
           }
       }
       return salesPerProduct;
    }
}



