class Animal{
    public void makeSound(){
        System.out.println("Sound of an animal");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Guau Guau");
    }
    public void bark(){
        System.out.println("Barking");
    }
}
public class PolyMorPhismExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
        Dog d = new Dog();
        d.bark();
        d.makeSound();
        //Upcasting
        Animal a1 = new Dog();
        a1.makeSound();
        //Downcasting error
        //Dog d1 = new Animal();
        //Downcasting
        Dog d2 = (Dog) a1;
        d2.bark();
        d2.makeSound();
    }

}
