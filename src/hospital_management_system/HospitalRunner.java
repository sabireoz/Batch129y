package hospital_management_system;

import java.util.Scanner;

public class HospitalRunner extends Hospital {


        static Hospital hospital = new Hospital();
        static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("\n********** WELCOME TO QATEAM02 HOSPITAL **********");

            patientRecord();
            complaintList();
            complaintChoice();
        }

        private static void patientRecord(){
            System.out.println("Please enter your name and surname: ");

            String nameSurname = input.nextLine();

            Patient patient = new Patient(nameSurname);
            hospital.setPatient(patient);
            System.out.println("Your Name: " + input.nextLine());

        }

        private static void complaintList(){
            for (int i = 0; i<hospital.currentStatus.size(); i++){
                System.out.println((i + 1) + " - " + hospital.currentStatus.get(i));
            }
        }

        private static void complaintChoice(){
            System.out.println("Please select your complaint: ");

            int choice = input.nextInt();
            Status status = new Status(hospital.currentStatus.get(choice-1), false);
            findDoctor(choice);
        }
        private static void findDoctor(int choice){
            System.out.println("Your doctor: " + hospital.titles.get(choice-1) + " "+hospital.doctorName.get(choice-1)+" " + hospital.doctorSurname.get(choice-1));
            System.out.println("Patient Record No: " + hospital.getPatient().getPatientID() + "\nPatient Name Surname: "+hospital.getPatient().getPatientName() + hospital.getPatient().getPatientSurname());
            System.out.println("Patient's complaint : " + hospital.currentStatus.get(choice-1));
            System.out.println("Urgency: Not urgent.");

        }


    }

