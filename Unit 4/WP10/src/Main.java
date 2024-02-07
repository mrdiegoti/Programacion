import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] arrayOfIntegers = {1, -1, 2, 5, 5, 6, 2, 7, -3, 3};
        for (int number: arrayOfIntegers){
            System.out.println(number + " ");
        }
        System.out.println();
        int[] arrayOfAbsolutes = convertToAbsolutes(arrayOfIntegers);
        System.out.println(arrayOfAbsolutes);
    }

    private static int[] convertToAbsolutes(int[] arrayOfIntegers) {
        HashSet<Integer> newSet = new HashSet<>();
        for (int i = 0; i < arrayOfIntegers.length; i++){
            newSet.add(Math.abs(arrayOfIntegers[i]));
        }
        int[] resultArray = new int[newSet.size()];
        int index= 0;
        for (int element: newSet){
            resultArray[index] = element;
            index++;
        }
        return resultArray;
    }
}
