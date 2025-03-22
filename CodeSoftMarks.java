import java.util.Scanner;
public class CodeSoftMarks {
    public static void main(String[]args){
       int Avgpercentage;
       int NoOfSubjects;
       int totalMarks = 0;
       String grade;
       Scanner sc = new Scanner(System.in);
    System.out.println("Enter No Of Subjects");
    NoOfSubjects = sc.nextInt();
    for(int i=1;i<=NoOfSubjects;i++){
  System.out.println("Enter Marks obtained in subject "+ i +" (out of 100 marks)");      
          int marks = sc.nextInt();
          totalMarks+=marks;
    } 

     Avgpercentage=totalMarks/NoOfSubjects;
     grade = CalculateGrade(Avgpercentage);

     System.out.println("Total Marks : "+ totalMarks);  
     System.out.println("Avgpercentage : " + Avgpercentage);
     System.out.println("Grade : " + grade);

}

public static String CalculateGrade(int percentage){
     if(percentage >=90){
          return "A Grade";
     }
     else if (percentage>=80){
        return "B Grade";
     }
     else if(percentage >= 70){
        return "C Grade";
     } 
     else if (percentage >=60){
        return "D Grade";
     }
     else if (percentage>=50){
        return "E Grade";
     }
     else{
        return "Fail";
     }
}
}