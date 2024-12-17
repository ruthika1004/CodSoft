import java.util.*;
public class studentGradeCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" subject marks: ");
        int totalMarks=0;
        for(int i=1;i<=n;i++){
            System.out.print("Enter the marks for subject number "+i+" between 0 to 100 : ");
            int marks=sc.nextInt();
            while(marks<0 || marks>100){
                System.out.println("Invalid marks, please enter the marks again between 0 to 100: ");
                marks=sc.nextInt();
            }
            totalMarks+=marks;
        }
        System.out.println("Total marks obtained are : "+totalMarks);
        int avg=(int)(totalMarks/n);
        System.out.println("Average Percentage obtained is: "+avg);
        String grade;
        if(avg>=90)
            grade="A";
        else if(avg>=80)
            grade="B";
        else if(avg>=70)
            grade="C";
        else if(avg>=60)
            grade="D";
        else if(avg>=50)
            grade="E";
        else
            grade="Fail";
        System.out.println("Grade obtained is: "+grade);
    }
}