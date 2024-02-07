
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient("427892349G", "391826343223", "Diego", "López", 18, "321456951", "traumatology");
        Doctor doc1 = new Doctor("4984765484D", "Dario", "Indries", 19, "pediatrics", 35000);
        Hospital myHospital = new Hospital("Miguel Servet");
        myHospital.addSpecialities("pediatrics");
        myHospital.addSpecialities("Traumatology");
        myHospital.addPatient(p1);
        myHospital.addDoctor(doc1);
        myHospital.showWaitingPatients();
        myHospital.showDoctors();
        myHospital.addPatient(p1);

        menu(myHospital);
        for (Patient patient : myHospital.getAttendPatients().keySet()){
            System.out.println(patient);
        }
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
            System.out.println("9-> Info specialities");
            System.out.println("10-> Exit");
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
                    myHospital.menuShowPatients();
                case 6:
                    myHospital.showDoctors();
                    break;
                case 7:
                    myHospital.deleteDcotor();
                    break;
                case 8:
                    myHospital.atendFirstPatient();
                case 9:
                    myHospital.infoSpecialities();
            }
        } while (option != 10);
    }


}


