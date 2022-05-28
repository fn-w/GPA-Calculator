package gpacalculator;
import java.util.Scanner;
public class GPACalculator {
    //declaring variable
    int no_subject=10 ;
    int total_creditHrs;
    int [] subject_marks=new int[no_subject];
    int [] subject_creditHrs=new int[no_subject];
    double [] grade=new double[no_subject];
    double gpa,points;
    int choice, ch;
    //constructors
    GPACalculator(){
        System.out.println("WELCOME TO CALCULATOR");
    }
      GPACalculator(int no){
        this.no_subject=no;
        System.out.println(this.no_subject);
    }
    //set method
    public void setValues(double gpa,int no_subject,int subject_marks[], int subject_creditHrs[],int total_creditHrs,double grade[]){
        this.gpa=gpa;
        this.total_creditHrs=total_creditHrs;
        this.subject_creditHrs=subject_creditHrs;
        this.subject_marks=subject_marks;
        this.grade=grade;
        this.points=points;
        
    }
    //get methods
  
    public int getno_subject(){
        return no_subject;
    }
    public int gettotal_creditHrs(){
        return total_creditHrs;
    }
    public double getgpa(){
        return gpa;
    }
    public double getpoints(){
        return points;
    }
    public int getSubject_marks(int subject_marks[]){
        return subject_marks[no_subject];
    }
    public int getsubject_creditHrs(int subject_creditHrs[]){
        return subject_creditHrs[no_subject];
    }
    public double getGrade(double grade[]){
        return grade[no_subject];
    }
}
