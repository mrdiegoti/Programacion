public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
        color = "red";
    }

    public Circle(double r){
        radius = r;
        color = "red";
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
class TestCircle{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        Circle c3 = new Circle(3.0, "Green");
        System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea());
        System.out.println(c3.getColor());
        System.out.println("The circle has radius of " + c1.getRadius() + " color " + c1.getColor() + " and area of " + c1.getArea());
        c1.setColor("brown");
        c1.setRadius(2.5);
        System.out.println("The circle has radius of " + c1.getRadius() + " color " + c1.getColor() + " and area of " + c1.getArea());
        System.out.println(c1.toString());
    }
}