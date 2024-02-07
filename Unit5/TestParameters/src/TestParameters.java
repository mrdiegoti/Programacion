public class TestParameters {
    public static void cambiar(int x){
        x++;
    }
    public static void cambiar2(int[] par){
        par[0]++;
    }

    public static void main(String[] args) {
        int x = 3;
        int[] arrx = {5, 6, 7};
        cambiar(x);
        System.out.println(x);
        cambiar2(arrx);
        System.out.println(arrx[0]);
    }
}
