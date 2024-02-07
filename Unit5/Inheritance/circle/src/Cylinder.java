public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        super();
        height = 1.0;
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height  = height;
    }

    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
class TestCylinder{
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("The cylinder has radius of " + c1.getRadius() + " and area of " + c1.getHeight());
        Cylinder c2 = new Cylinder(2.0);
        System.out.println("The cylinder has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        Cylinder c3 = new Cylinder(3.0, 5.0);
        System.out.println("The cylinder has radius of " + c3.getRadius() + " and area of " + c3.getArea());
        System.out.println(c3.getColor());
        System.out.println("The cylinder has radius of " + c1.getRadius() + " color " + c1.getColor() + " and area of " + c1.getArea());
        c1.setColor("brown");
        c1.setRadius(2.5);
        System.out.println("The cylinder has radius of " + c1.getRadius() + " color " + c1.getColor() + " and area of " + c1.getArea());
        System.out.println(c1.toString());
    }
}
