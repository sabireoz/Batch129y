package hospital_management_system;

import java.util.Arrays;
import java.util.List;
import java.util.*;
public class DataBank {





  /*  static Map<Integer, String > patientListMap = new HashMap<>();
    protected String[]  = { "Nilson", "John", "Robert", "Marry", "Alan", "Mahesh"};
    protected String[] doctorSurname = { "Avery", "Abel", "Erik", "Jacob", "Pedro", "Tristen"};
    protected String[] titles = { "Allergist", "Norolog", "General Surgeon", "Pediatrician",
            "Internist", "Cardiologist" };
    protected String[] patientName = { "Warren", "Petanow", "Sophia", "Emma", "Darian",
            "Peter" };
    protected String[] patientSurname = { "Traven", "William", "George", "Tristan", "Luis",
            "Cole"};
    protected String[] currentStatus = { "Allergy", "Headache", "Diabetics", "Cold", "Migraine", "Heart Diseases"};

     protected int [] patientID = {111,222,333,444,555,666};

   */


        public DataBank(){

        }
        protected List<String> doctorName = Arrays.asList("Nilson", "John", "Robert", "Marry", "Alan", "Mahesh");
        protected List<String> doctorSurname = Arrays.asList("Avery", "Abel", "Erik", "Jacob", "Pedro", "Tristen");
        protected List<String> titles = Arrays.asList("Allergist", "Norolog", "General Surgeon", "Pediatrician",
                "Internist", "Cardiologist");
        protected List<String> patientName = Arrays.asList("Warren", "Petanow", "Sophia", "Emma", "Darian",
                "Peter");
        protected List<String> patientSurname = Arrays.asList("Traven", "William", "George", "Tristan", "Luis", "Cole");
        protected List<Integer> patientID = Arrays.asList(111,222,333,444,555,666);
        protected List<String> currentStatus = Arrays.asList("Allergy", "Headache", "Diabetics", "Cold", "Migraine", "Heart Diseases");

    }


