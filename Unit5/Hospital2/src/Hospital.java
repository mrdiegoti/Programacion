//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Hospital {
    private String name;
    private ArrayList<String> specialities;
    private ArrayList<Patient> patientsWaiting;
    private ArrayList<Doctor> doctors;
    private ArrayList<Collection> attendPatients;
    private ArrayList<Collection> unAttendPatients;

    public Hospital(String name) {
        this.name = name;
        this.specialities = new ArrayList();
        this.patientsWaiting = new ArrayList();
        this.doctors = new ArrayList();
        System.out.println("Hospital " + name + " created");
        this.attendPatients = new ArrayList();
        this.unAttendPatients = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSpecialities() {
        return this.specialities;
    }

    public void setSpecialities(ArrayList<String> specialities) {
        this.specialities = specialities;
    }

    public ArrayList<Patient> getPatientsWaiting() {
        return this.patientsWaiting;
    }

    public void setPatientsWaiting(ArrayList<Patient> patientsWaiting) {
        this.patientsWaiting = patientsWaiting;
    }

    public ArrayList<Doctor> getDoctors() {
        return this.doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public ArrayList<Collection> getAttendPatients() {
        return this.attendPatients;
    }

    public void setAttendPatients(ArrayList<Collection> attendPatients) {
        this.attendPatients = attendPatients;
    }

    public ArrayList<Collection> getUnAttendPatients() {
        return this.unAttendPatients;
    }

    public void setUnAttendPatients(ArrayList<Collection> unAttendPatients) {
        this.unAttendPatients = unAttendPatients;
    }

    public String toString() {
        String var10000 = this.name;
        return "Hospital{name='" + var10000 + "', specialities=" + String.valueOf(this.specialities) + ", patientsWaiting=" + String.valueOf(this.patientsWaiting) + ", doctors=" + String.valueOf(this.doctors) + ", attendPatients=" + String.valueOf(this.attendPatients) + ", unAttendPatients=" + String.valueOf(this.unAttendPatients) + "}";
    }

    public void addSpecialities(String speciality) {
        if (this.specialities.contains(speciality)) {
            System.out.println(speciality + " speciality already licensed");
        } else {
            this.specialities.add(speciality);
        }

        System.out.println(speciality + " speciality added");
    }

    public void addDoctor(Doctor doctor) {
        PrintStream var10000;
        String var10001;
        if (this.specialities.contains(doctor.getSpeciality())) {
            this.doctors.add(doctor);
            var10000 = System.out;
            var10001 = doctor.getName();
            var10000.println("Doctor " + var10001 + " " + doctor.getLastName() + " aded");
        } else {
            var10000 = System.out;
            var10001 = doctor.getName();
            var10000.println("Doctor " + var10001 + " " + doctor.getLastName() + " not aded because his especiality isn´t contained in the hospital");
        }

    }

    public void addPatient(Patient patient) {
        this.patientsWaiting.add(patient);
        PrintStream var10000 = System.out;
        String var10001 = patient.getName();
        var10000.println("Patient " + var10001 + " " + patient.getLastName() + " aded");
    }

    public void deleteDcotor() {
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Insert dni of doctor to delete: ");
        String dniToDelete = in.nextLine();
        Iterator var3 = this.doctors.iterator();

        Doctor doctor;
        do {
            if (!var3.hasNext()) {
                System.out.println("Doctor with DNI " + dniToDelete + " not found");
                return;
            }

            doctor = (Doctor)var3.next();
        } while(!doctor.getDNI().equals(dniToDelete));

        this.doctors.remove(doctor);
        System.out.println("Doctor with DNI " + dniToDelete + " deleted");
    }

    public void showPatients() {
        Iterator var1 = this.patientsWaiting.iterator();

        while(var1.hasNext()) {
            Patient patient = (Patient)var1.next();
            System.out.println(patient);
        }

    }

    public void showDoctors() {
        if (this.doctors.isEmpty()) {
            System.out.println("There are no doctors");
        } else {
            Iterator var1 = this.doctors.iterator();

            while(var1.hasNext()) {
                Doctor doctor = (Doctor)var1.next();
                System.out.println(doctor);
            }
        }

    }

    public void modifyPatient() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce the DNI of patient to modify: ");
        String dniToModify = in.nextLine();
        Iterator var3 = this.patientsWaiting.iterator();

        Patient patient;
        do {
            if (!var3.hasNext()) {
                System.out.println("Patient with DNI " + dniToModify + " not found");
                return;
            }

            patient = (Patient)var3.next();
        } while(!patient.getDNI().equals(dniToModify));

        System.out.println(patient);
        this.patientsWaiting.remove(patient);
        this.patientsWaiting.add(this.inputPatient());
    }

    public Patient inputPatient() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert DNI: ");
        String DNI = in.nextLine();
        System.out.println("Insert SSNumber: ");
        String SSnumber = in.nextLine();
        System.out.println("Insert name: ");
        String name = in.nextLine();
        System.out.println("Insert last name: ");
        String lastName = in.nextLine();
        System.out.println("Insert age: ");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("Insert phone: ");
        String phone = in.nextLine();
        System.out.println("Insert disease: ");
        String disease = in.nextLine();
        return new Patient(DNI, SSnumber, name, lastName, age, phone, disease);
    }

    public Doctor inputDoctor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert DNI: ");
        String DNI = in.nextLine();
        System.out.println("Insert name: ");
        String name = in.nextLine();
        System.out.println("Insert last name: ");
        String lastName = in.nextLine();
        System.out.println("Insert age: ");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("Insert speciality: ");
        String speciality = in.nextLine();
        System.out.println("Insert salary: ");
        double salary = in.nextDouble();
        return new Doctor(DNI, name, lastName, age, speciality, salary);
    }

    public void modifyDoctor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce the DNI of doctor to modify: ");
        String dniToModify = in.nextLine();
        Iterator var3 = this.doctors.iterator();

        Doctor doctor;
        do {
            if (!var3.hasNext()) {
                System.out.println("Doctor with DNI " + dniToModify + " not found");
                return;
            }

            doctor = (Doctor)var3.next();
        } while(!doctor.getDNI().equals(dniToModify));

        System.out.println(doctor);
        this.doctors.remove(doctor);
        this.doctors.add(this.inputDoctor());
    }

    public void atendPatient() {
        Iterator var1 = this.patientsWaiting.iterator();

        while(var1.hasNext()) {
            Patient patient = (Patient)var1.next();
            if (patient.getDisease().isEmpty()) {
                System.out.println("Today it's not possible to attend to this patient in this hospital. Sorry so much.");
            } else {
                this.patientsWaiting.remove(patient);
            }

            Iterator var3 = this.doctors.iterator();

            while(var3.hasNext()) {
                Doctor doctor = (Doctor)var3.next();
                if (doctor.getSpeciality().equals(patient.getDisease())) {
                    System.out.println("We can attend you now, pass over here ");
                } else {
                    System.out.println("We can´t attend you right now, please wait");
                }
            }
        }

    }

    public void showPatientsMenu() {
    }
}