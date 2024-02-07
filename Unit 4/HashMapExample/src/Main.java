import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap <String, String> phoneBook = new HashMap<>();
        phoneBook.put("Diego", "798945345");
        phoneBook.put("Lucas", "635945345");
        phoneBook.put("Dario", "684945345");
        System.out.println(phoneBook.get("Lucas"));
    }
}
