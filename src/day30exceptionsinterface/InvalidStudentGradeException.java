package day30exceptionsinterface;
/*

1)Kendi application iza ozel kurallar olusturmak icin kendi "Exception class"larinizi olusturabilirsiniz
2)Olusturdugunuz Exception classlar
i)compile time Exception

ii)Run time Exception olabilir
3)compile time Exception olusturmak icin clasinizin Parenti Exception class olmalidir.
4)Run time Exception olusturmak icin clasinizin Parenti  Run Time Exception class olmalidir.
5)

 */
public class InvalidStudentGradeException extends Exception{

public InvalidStudentGradeException(String message){

    super(message);
}


    }


