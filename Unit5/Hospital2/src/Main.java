//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("427892349G", "391826343223", "Diego", "López", 18, "321456951", "alopecic");
        System.out.println(p1);
        Doctor doc1 = new Doctor("4984765484D", "Dario", "Indries", 19, "Traumatology", 35000.0);
        System.out.println(doc1);
        Hospital myHospital = new Hospital("Miguel Servet");
        myHospital.addSpecialities("Pediatrics");
        myHospital.addSpecialities("Traumatology");
        myHospital.addPatient(p1);
        myHospital.addDoctor(doc1);
        myHospital.showPatients();
        myHospital.showDoctors();
        menu(myHospital);
    }

    private static void menu(Hospital myHospital) {
        Scanner in = new Scanner(System.in);

        int option;
        do {
            System.out.println("========== MENU ==========");
            System.out.println("1-> Register patient");
            System.out.println("2-> Register doctor");
            System.out.println("3-> Modify patient");
            System.out.println("4-> Modify doctor");
            System.out.println("5-> Show all patients");
            System.out.println("6-> Show all doctors");
            System.out.println("7-> Delete doctor");
            System.out.println("8-> Attend a patient");
            System.out.println("9-> Exit");
            System.out.println("Choose an option (1-9): ");
            option = in.nextInt();
            switch (option) {
                case 1:
                    myHospital.addPatient(myHospital.inputPatient());
                    break;
                case 2:
                    myHospital.addDoctor(myHospital.inputDoctor());
                    break;
                case 3:
                    myHospital.modifyPatient();
                    break;
                case 4:
                    myHospital.modifyDoctor();
                    break;
                case 5:
                    myHospital.showPatientsMenu();
                    System.out.println("===== Secondary Menu =====");
                    System.out.println("1- List of waiting patients");
                    System.out.println("2- List of attended patients");
                    System.out.println("3- List of attended patients by a specific doctor");
                    System.out.println("4- Patients who have not been able to be treated");
                    System.out.println("Choose an option (1-4)");
                    int secundaryOption = in.nextInt();
                    switch (secundaryOption) {
                        case 1:
                            myHospital.getPatientsWaiting();
                        case 2:
                            myHospital.getAttendPatients();
                        case 3:
                            myHospital.getAttendPatients();
                        case 4:
                            myHospital.getUnAttendPatients();
                        default:
                            continue;
                    }
                case 6:
                    myHospital.showDoctors();
                    break;
                case 7:
                    myHospital.deleteDcotor();
                    break;
                case 8:
                    myHospital.atendPatient();
            }
        } while(option != 9);

    }
}