import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> mySet1 = new HashSet<>(Set.of(1, 2, 3));
        HashSet<Integer> mySet2 = new HashSet<>(Set.of(3, 5, 7));

        ArrayList<Integer> arrayResult = joinSets(mySet1, mySet2);
        System.out.println(arrayResult);
        for (int number: arrayResult){
            System.out.print(number + " ");
        }
    }

    private static ArrayList<Integer> joinSets(HashSet<Integer> mySet1, HashSet<Integer> mySet2) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        resultArray.addAll(mySet1);
        for (int number: mySet2){
            resultArray.add(number);
        }
        return resultArray;
    }
}
