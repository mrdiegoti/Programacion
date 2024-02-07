//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Patient {
    private String DNI;
    private String SSNUmber;
    private String name;
    private String lastName;
    private int age;
    private String phone;
    private String disease;

    public Patient(String DNI, String SSNUmber, String name, String lastName, int age, String phone, String disease) {
        this.DNI = DNI;
        this.SSNUmber = SSNUmber;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.disease = disease;
    }

    public String getDNI() {
        return this.DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSSNUmber() {
        return this.SSNUmber;
    }

    public void setSSNUmber(String SSNUmber) {
        this.SSNUmber = SSNUmber;
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

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDisease() {
        return this.disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String toString() {
        return "Patient{DNI='" + this.DNI + "', SSNUmber='" + this.SSNUmber + "', name='" + this.name + "', lastName='" + this.lastName + "', age=" + this.age + ", phone='" + this.phone + "', disease='" + this.disease + "'}";
    }
}