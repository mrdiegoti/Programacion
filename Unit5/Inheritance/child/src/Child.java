class parent{
    String name;
    public void details(){
        name = "Parent";
        System.out.println(name);
    }
        }
public class Child extends parent{
    String name;
    public void details(){
        super.details();
        name = "Child";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Child cobj = new Child();
        cobj.details();
    }
}
