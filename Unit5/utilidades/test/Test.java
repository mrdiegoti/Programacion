package utilidades.test;


import utilidades.educacion.GoodBye;
import utilidades.educacion.Greeting;

public class Test {
    public static void main(String[] args) {
        Greeting g1 = new Greeting();
        g1.sayHello();
        GoodBye g2 = new GoodBye();
        g2.sayGoodBye();
    }
}
