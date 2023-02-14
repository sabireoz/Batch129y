package hospital_management_system;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Patient  {

        static int counter = 100;
        private String PatientName;
        private String PatientSurname;
        private int patientID;


        public Patient(){

        }


        public Patient(String patientName, String patientSurname, int patientID) {
            this.PatientName = patientName.toUpperCase();
            this.PatientSurname = patientSurname.toUpperCase();
            this.patientID = counter++;
        }

        public Patient(String nameSurname) {

        }

        public String getPatientName() {
            return PatientName;
        }

        public void setPatientName(String patientName) {
            PatientName = patientName;
        }

        public String getPatientSurname() {
            return PatientSurname;
        }

        public void setPatientSurname(String patientSurname) {
            PatientSurname = patientSurname;
        }

        public int getPatientID() {
            return patientID;
        }

        public void setPatientID(int patientID) {
            this.patientID = patientID;
        }

        @Override
        public String toString() {
            return "Patient{" +
                    "PatientName='" + PatientName + '\'' +
                    ", PatientSurname='" + PatientSurname + '\'' +
                    ", patientID=" + patientID +
                    '}';
        }
    }
