import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hospital {
    private String name;
    private ArrayList<String> specialities;
    private ArrayList<Patient> patientsWaiting;
    private ArrayList<Doctor> doctors;
    private HashMap<Patient, Doctor> attendPatients;
    private ArrayList<Patient> unAttendPatients;


    public Hospital(String name) {
        this.name = name;
        specialities = new ArrayList<>();
        patientsWaiting = new ArrayList<>();
        doctors = new ArrayList<>();
        System.out.println("Hospital " + name + " created");
        attendPatients = new HashMap<>();
        unAttendPatients = new ArrayList();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(ArrayList<String> specialities) {
        this.specialities = specialities;
    }

    public ArrayList<Patient> getPatientsWaiting() {
        return patientsWaiting;
    }

    public void setPatientsWaiting(ArrayList<Patient> patientsWaiting) {
        this.patientsWaiting = patientsWaiting;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public HashMap<Patient, Doctor> getAttendPatients() {
        return attendPatients;
    }

    public void setAttendPatients(HashMap<Patient, Doctor> attendPatients) {
        this.attendPatients = attendPatients;
    }

    public ArrayList<Patient> getUnAttendPatients() {
        return unAttendPatients;
    }

    public void setUnAttendPatients(ArrayList<Patient> unAttendPatients) {
        this.unAttendPatients = unAttendPatients;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", specialities=" + specialities +
                ", patientsWaiting=" + patientsWaiting +
                ", doctors=" + doctors +
                ", attendPatients=" + attendPatients +
                ", unAttendPatients=" + unAttendPatients +
                '}';
    }

    public void addSpecialities(String speciality) {
        if (specialities.contains(speciality)) {
            System.out.println(speciality + " speciality already licensed");
        } else specialities.add(speciality);
        System.out.println(speciality + " speciality added");
    }

    public void addDoctor(Doctor doctor) {
        if (specialities.contains(doctor.getSpeciality())) {
            doctors.add(doctor);
            System.out.println("Doctor " + doctor.getName() + " " + doctor.getLastName() + " aded");
        } else
            System.out.println("Doctor " + doctor.getName() + " " + doctor.getLastName() + " not aded because his especiality isn´t contained in the hospital");
    }

    public void addPatient(Patient patient) {
        patientsWaiting.add(patient);
        System.out.println("Patient " + patient.getName() + " " + patient.getLastName() + " aded");
    }

    public void deleteDcotor() {
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Insert dni of doctor to delete: ");
        String dniToDelete = in.nextLine();
        for (Doctor doctor : doctors) {
            if (doctor.getDNI().equals(dniToDelete)) {
                doctors.remove(doctor);
                System.out.println("Doctor with DNI " + dniToDelete + " deleted");
                return;
            }
        }
        System.out.println("Doctor with DNI " + dniToDelete + " not found");
    }

    public void showWaitingPatients() {
        if (patientsWaiting.isEmpty()) {
            System.out.println("No patients waiting ");
        } else {
            for (Patient patient : patientsWaiting) {
                System.out.println(patient);
            }
        }
    }

    public void showDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("There are no doctors");
        } else {
            for (Doctor doctor : doctors) {
                System.out.println(doctor);
            }
        }
    }

    public void modifyPatient() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce the DNI of patient to modify: ");
        String dniToModify = in.nextLine();
        for (Patient patient : patientsWaiting) {
            if (patient.getDNI().equals(dniToModify)) {
                System.out.println(patient);
                patientsWaiting.remove(patient);
                patientsWaiting.add(inputPatient());
                return;
            }
        }
        System.out.println("Patient with DNI " + dniToModify + " not found");
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
        for (Doctor doctor : doctors) {
            if (doctor.getDNI().equals(dniToModify)) {
                System.out.println(doctor);
                doctors.remove(doctor);
                doctors.add(inputDoctor());
                return;
            }
        }
        System.out.println("Doctor with DNI " + dniToModify + " not found");
    }

    public void atendFirstPatient() {
        if (patientsWaiting.isEmpty()) {
            System.out.println("No patients waiting ");
        } else {
            Patient firstPatient = patientsWaiting.get(0);
            if (specialities.contains(firstPatient.getDisease())) {
                for (Doctor doctor : doctors) {
                    if (doctor.getSpeciality().equals(firstPatient.getDisease())) {
                        attendPatients.put(firstPatient, doctor);
                        System.out.println("Patient attended");
                        patientsWaiting.remove(0);
                        return;
                    }
                }
                unAttendPatients.add(firstPatient);
                patientsWaiting.remove(0);
            } else {
                unAttendPatients.add(firstPatient);
                patientsWaiting.remove(0);
            }
        }

    }

    public void menuShowPatients() {
        Scanner in = new Scanner(System.in);
        int option;
        do {
            System.out.println("===== Secondary Menu =====");
            System.out.println("1- List of waiting patients");
            System.out.println("2- List of attended patients");
            System.out.println("3- List of attended patients by a specific doctor(search by DNI)");
            System.out.println("4- Patients who have not been able to be treated");
            System.out.println("5- Exit");
            System.out.println("Choose an option (1-5)");
            option = in.nextInt();
            switch (option) {
                case 1:
                    showWaitingPatients();
                    break;
                case 2:
                    showAttendPatients();
                    break;
                case 3:
                    showAttendPatientsByDoctor();
                    break;
                case 4:
                    showUnAttendPatientsByDoctor();
                    break;
            }
        } while (option != 5);

    }

    private void showUnAttendPatientsByDoctor() {
        if (unAttendPatients.isEmpty()) {
            System.out.println("No unattended patients");
        } else {
            for (Patient patient : unAttendPatients) {
                System.out.println(patient);
            }
        }

    }

    private void showAttendPatientsByDoctor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce Doctor`s DNI");
        String dniToSearch = in.nextLine();
        boolean dniFound = false;
        for (Doctor doctor : doctors) {
            if (dniToSearch.equals(doctor.getDNI())) {
                dniFound = true;
                for (Patient patient : attendPatients.keySet()) {
                    if (doctor.equals(attendPatients.get(patient))) {
                        System.out.println(patient);
                    }
                }
                break;
            }
        }
        if (!dniFound) System.out.println("No doctor found with DNI " + dniToSearch);
    }

    private void showAttendPatients() {
        for (Patient patient : attendPatients.keySet()) {
            System.out.println(patient);
        }
    }

    public void infoSpecialities() {
        Scanner in = new Scanner(System.in);
        int option;
        do {
            System.out.println("===== [Info] =====");
            System.out.println("1-> List of specialities attended by our doctors");
            System.out.println("2-> List of specialities not covered with unattended patients");
            System.out.println("3-> Exit");
            option = in.nextInt();
            switch (option){
                case 1:
                    specialitiesAttendedByDoctors();
                case 2:
                    specialitiesNotCoveredwithUnattendedPatients();
            }
        }
        while (option != 3);


    }

    private void specialitiesNotCoveredwithUnattendedPatients() {
        
    }

    private void specialitiesAttendedByDoctors() {
        for (String specialities: specialities){
            for (Doctor doctor: doctors){
                if (doctor.getSpeciality().equals(specialities)){
                    System.out.println("The doctor " + doctor + " attend the speciality " + specialities);
                }
                else {
                    System.out.println("This speciality isn´t covered by any doctor in this hospital");
                }
            }
            break;
        }
    }
}
