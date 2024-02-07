//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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
        return this.DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Doctor{DNI='" + this.DNI + "', name='" + this.name + "', lastName='" + this.lastName + "', age=" + this.age + ", speciality='" + this.speciality + "', salary='" + this.salary + "'}";
    }
}
