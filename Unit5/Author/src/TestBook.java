public class TestBook {
    public static void main(String[] args) {
        Author a = new Author("Juan carlos navarro ", "fuwhefiowue@gmail.com", 'm');
        Book b = new Book("Alatriste", a, 24.0, 5);
        System.out.println(b);
    }
}
