public class testAuthor {
    public static void main(String[] args) {
        Author a = new Author("Juan carlos navarro ", "fuwhefiowue@gmail.com", 'm');
        System.out.println(a);
        a.setEmail("jcnavarro@gmail.com");
        System.out.println(a);
        System.out.println(a.getEmail());
        System.out.println(a.getGender());
        System.out.println(a.getName());
    }
}
