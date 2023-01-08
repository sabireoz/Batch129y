package day30exceptionsinterface;

public class Exceptions03 {

    public static void main(String[] args) {
    getStudentGrade(98);
    }
    public static void getStudentGrade(int grade ){
        if (grade<0||grade >100){
            try {
                throw new InvalidStudentGradeException("Student's grades cannot be less than zero or than 100 ");
            } catch (InvalidStudentGradeException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println(grade);
        }

    }

public static void  getTheNumberOsStudent(int numOfStudents){
    if ((numOfStudents < 0)) {
        try {
            throw new InvalidNumberException("Student number cannot be negative");
        }catch (InvalidNumberException e){
            System.err.println(e.getMessage());
        }
    }else{
        System.out.println(numOfStudents);
    }
        }
    }


