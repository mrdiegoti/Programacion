import java.util.HashMap;

public class PhoneBook {
    private HashMap <String, String> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public int getNumberOfEntries(){
        return contacts.size();
    }
    public void enterNumber(String name, String number){
        contacts.put(name, number);
    }

    public String lookupNumber(String name){
        if (contacts.containsKey(name)) return contacts.get(name);
        else return "The name isn´t in the list";
    }
    public void printNames(){
        for (String key : contacts.keySet()){
            System.out.print(key + " ");
        }
    }

}
class TestPhoneBook{
    public static void main(String[] args) {
        PhoneBook p1 = new PhoneBook();
        p1.enterNumber("Diego", "123456789");
        System.out.println(p1.lookupNumber("Diego"));
        p1.enterNumber("Diego", "987456320");
        System.out.println(p1.lookupNumber("Diego"));
        p1.enterNumber("Lucas", "8646513352");
        System.out.println(p1.lookupNumber("Lucas"));
        p1.enterNumber("Dario", "4614351468");
        System.out.println(p1.lookupNumber("Dario"));
        p1.printNames();
    }
}
