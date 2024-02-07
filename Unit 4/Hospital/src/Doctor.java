import java.util.ArrayList;

public class Doctor {
    private String DNI;
    private String name;
    private String lastName;
    private int age;
    private String speciality;
    private double salary;

    public Doctor(String DNI, String name, String lastName, int age, String speciality, double salary) {
        this.DNI = DNI;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.speciality = speciality;
        this.salary = salary;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "DNI='" + DNI + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", speciality='" + speciality + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

}
