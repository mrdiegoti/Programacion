import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> mySet1 = new HashSet<>();
        HashSet<Integer> mySet2 = new HashSet<>();
        mySet1.add(1);
        mySet1.add(2);
        mySet1.add(3);
        mySet2.add(3);
        mySet2.add(5);
        mySet2.add(7);
        HashSet<Integer> mySet3 = new HashSet<>(Set.of(1, 2, 3));

        HashSet<Integer> myUnionSet = joinSets(mySet1, mySet2);
            for (int element: myUnionSet){
                System.out.print(element);
            }

    }

    public static HashSet<Integer> joinSets(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> newSet = new HashSet<>();
        newSet.addAll(set1);
        newSet.addAll(set2);
        return newSet;
    }
}