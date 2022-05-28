package gpacalculator;
import java.util.Scanner;
import java.lang.Math;
public class Calculation {
    public static void main (String [] args){
        int i, n1,n2;
        double add,sub,mul,div,num1,num2;
        GPACalculator obj=new GPACalculator();
        Scanner input=new Scanner(System.in);
        int n=0;
        n1=0;
        n2=0;
        while(n>= -1){
            System.out.println("MENU");
            System.out.println("Enter 1 for simple calculator:");
            System.out.println("enter 2 for scientific calculator:");
            System.out.println("Enter 3 for GPA calculator:");
            System.out.println("Enter -1 for exit!");
            obj.choice=input.nextInt();
            //conditions!
            if(obj.choice==1){
                while(n1>=-1){
                    System.out.println("Simple calculator:");
                    System.out.println("Enter 1 for addition:");
                    System.out.println("enter 2 for subtraction:");
                    System.out.println("enter 3 for multiplication:");
                    System.out.println("enter 4 for division:");
                    System.out.println("enter -1 to exit simple calculator!");
                    obj.ch=input.nextInt();
                    if(obj.ch==1){
                        System.out.println("ADDITION:-");
                        System.out.println("Enter two numbers:");
                        System.out.println("enter first number:");
                        num1=input.nextDouble();
                        System.out.println("Enter second number:");
                        num2=input.nextDouble();
                        add=num1+num2;
                        System.out.println("Result= " +add);
                    }
                    else if(obj.ch==2){
                        System.out.println("SUBTRACTION:-");
                        System.out.println("Enter two numbers:");
                        System.out.println("enter first number:");
                        num1=input.nextDouble();
                        System.out.println("Enter second number:");
                        num2=input.nextDouble();
                        sub=num1-num2;
                        System.out.println("Result= " +sub);
                    }
                    else if(obj.ch==3){
                        System.out.println("MULTIPLICATION:-");
                        System.out.println("Enter two numbers:");
                        System.out.println("enter first number:");
                        num1=input.nextDouble();
                        System.out.println("Enter second number:");
                        num2=input.nextDouble();
                        mul=num1*num2;
                        System.out.println("Result= " +mul);
                     }
                    else if (obj.ch==4){
                        System.out.println("DIVISION:-");
                        System.out.println("Enter two numbers:");
                        System.out.println("enter first number:");
                        num1=input.nextDouble();
                        System.out.println("Enter second number:");
                        num2=input.nextDouble();
                        div=num1/num2;
                        System.out.println("Result= " +div);
                    }
                    else if(obj.ch==-1){
                        break;
                    }
                }  
            }
            else if(obj.choice==2){
                while(n2>=-1){
                    System.out.println("SCIENTIFIC CALCULATOR:-");
                    System.out.println("enter 1 to calculate sin:");
                    System.out.println("enter 2 to calculate cos:");
                    System.out.println("enter 3 to calculate tan:");
                    System.out.println("enter -1 to exit scientific calculator!");
                    obj.ch=input.nextInt();
                   if(obj.ch==1){
                       System.out.println("sin:-");
                       System.out.println("enter two numbers:");
                       System.out.println("enter first number:");
                       num1=input.nextDouble();
                       System.out.println("Enter second number:");
                       num2=input.nextDouble();
                       double x = Math.toRadians(num1); 
                       double y = Math.toRadians(num2); 
                       System.out.println("sin: "+(Math.sin(x)));
                       System.out.println(("sin: "+Math.sin(y)));
                    }
                    else if(obj.ch==2){
                        System.out.println("cos:-");
                        System.out.println("enter two numbers:");
                        System.out.println("enter first number:");
                        num1=input.nextDouble();
                        System.out.println("Enter second number:");
                        num2=input.nextDouble();
                        double x = Math.toRadians(num1); 
                        double y = Math.toRadians(num2); 
                        System.out.println(("cos: "+Math.cos(x)));
                        System.out.println(("cos: "+Math.cos(y)));
                    }
                    else if(obj.ch==3){
                        System.out.println("tan:-");
                        System.out.println("enter two numbers:");
                        System.out.println("enter first number:");
                        num1=input.nextDouble();
                        System.out.println("Enter second number:");
                        num2=input.nextDouble();
                        double x = Math.toRadians(num1); 
                        double y = Math.toRadians(num2); 
                        System.out.println(("tan: "+Math.tan(x)));
                        System.out.println(("tan: "+Math.tan(y)));
                    }
                    else if(obj.ch==-1){
                        break;
                    }
                 }
            }   
            else if(obj.choice==3){
                System.out.println("GPA CALCULATOR");
                System.out.println("Enter number of subjects:");
                obj.no_subject=input.nextInt();
                System.out.println("Enter your marks and credit hours of each subject:");
                for(i=0;i<obj.no_subject;i++){
                System.out.println("Enter marks in "+ (i+1) +" subject:");
                obj.subject_marks[i]=input.nextInt();
                System.out.println("Enter credit hours of "+ (i+1) +" subject:");
                 obj.subject_creditHrs[i]=input.nextInt();
                }
                //calculating marks
                for(i=0;i<obj.no_subject;i++){
                    if(obj.subject_marks[i]>=90){
                        obj.grade[i]=4;
                    }
                    else if(obj.subject_marks[i]>=85 && obj.subject_marks[i]<90){
                        obj.grade[i]=3.7;
                    }
                    else if(obj.subject_marks[i]>=80 && obj.subject_marks[i]<85){
                        obj.grade[i]=3.3;
                    }
                    else if(obj.subject_marks[i]>=75 && obj.subject_marks[i]<80){
                       obj.grade[i]=3;
                    }
                    else if(obj.subject_marks[i]>=70 && obj.subject_marks[i]<75){
                        obj.grade[i]=2.7;
                    }
                    else if(obj.subject_marks[i]>=65 && obj.subject_marks[i]<70){
                        obj.grade[i]=2.3;
                    }
                    else if(obj.subject_marks[i]>=60 && obj.subject_marks[i]<65){
                       obj.grade[i]=2;
                    }
                   else if(obj.subject_marks[i]>=55 && obj.subject_marks[i]<60){
                        obj.grade[i]=1.7;
                    }
                    else if(obj.subject_marks[i]>=50 && obj.subject_marks[i]<55){
                       obj.grade[i]=1.3;
                    }
                    else if(obj.subject_marks[i]<50){
                       obj.grade[i]=0;
                    }
                }
                //adding credit hours(addition)
                obj.total_creditHrs=0;
                obj.points=0;
                for(i=0;i<obj.no_subject;i++){
                obj.total_creditHrs=obj.subject_creditHrs[i]+obj.total_creditHrs;
                }
                //multiplying credit hours and grade(gpa) of each subject
               for(i=0;i<obj.no_subject;i++){
                   obj.points=obj.grade[i]*obj.subject_creditHrs[i]+obj.points;
                }
                obj.gpa=obj.points/obj.total_creditHrs;
                System.out.println("  ");
                System.out.println("Congratulations your GPA is: "+obj.gpa);  
            }
            else if(obj.choice==-1){
                break;
            }
           n++;
        }
    }
}
                
        
        
        
       
   
    
