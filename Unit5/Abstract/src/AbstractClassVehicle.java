public abstract class AbstractClassVehicle {
    private int peso;
    public void peso(int peso){
        this.peso = peso;
    }

    public abstract int getVelocidadActual();
}
class Car extends AbstractClassVehicle{
    @Override
    public int getVelocidadActual() {
        System.out.println("Estoy en el coche");
        return 10;
    }
}

class Bicicleta extends AbstractClassVehicle{

    @Override
    public int getVelocidadActual() {
        return 0;
    }
}

class TestAbstract{
    public static void main(String[] args) {

    }
}
