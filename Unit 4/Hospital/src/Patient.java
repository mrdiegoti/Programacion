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
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSSNUmber() {
        return SSNUmber;
    }

    public void setSSNUmber(String SSNUmber) {
        this.SSNUmber = SSNUmber;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "DNI='" + DNI + '\'' +
                ", SSNUmber='" + SSNUmber + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", disease='" + disease + '\'' +
                '}';
    }
}
