import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("One");
        mySet.clear();
        mySet.add("Two");
        mySet.add("Three");
        //System.out.println(mySet.add("Two"));
        //System.out.println(mySet.add("Four"));
        mySet.remove("Three");
        System.out.println(mySet.contains("Three"));
        System.out.println(mySet.size());
        mySet.add("One");
        mySet.add("Two");
        mySet.add("Three");

        /*for (String element: mySet){
            System.out.println(element);
        }*/

        Iterator<String> it = mySet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
