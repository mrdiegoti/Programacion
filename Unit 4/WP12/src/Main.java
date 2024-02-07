import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 4 , 2 , 5 , 5 , 5, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        /*for (int i = 0; i < array.length; i++){
            map.put(array[i], 0);
        }*/
        for (int i = 0; i < array.length; i++){
            if (map.containsKey(array[i])){
                map.put(array[i], map.get(array[i] + 1));
            } else map.put(array[i], 1);
        }
        System.out.println(map);
    }
}
