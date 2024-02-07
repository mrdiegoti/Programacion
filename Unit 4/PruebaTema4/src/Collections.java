import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce a phrase");
        String text = in.nextLine();
        System.out.println(text);
        for (String str : lst){
            System.out.println(str);
        }
        Iterator<String> iter = lst.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
     }
}
