public class Reptile implements  Animal{
    @Override
    public void eat() {
        System.out.println("Reptile eats");
    }

    @Override
    public void travel() {
        System.out.println("Reptile travels");
    }

    public void reptar(){
        System.out.println("Reptile repta");
    }
}
