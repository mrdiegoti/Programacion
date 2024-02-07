class vehicle
{
    String vehicleType;
}

public class car extends vehicle {
    String modeltype;
    public void showDetails(){
        vehicleType = "Car";
        modeltype = "Sports";
        System.out.println(modeltype+" "+vehicleType);
    }

    public static void main(String[] args) {
        car car = new car();
        car.showDetails();
    }
}
