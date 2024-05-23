import java.util.Scanner;


public class Studentgradecalculator {
    public static void main (String args[]){
    int m1,m2,m3,m4,m5;
    int totalmarks=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter marks scored in Maths out of 100");
    m1=sc.nextInt();
    System.out.println("Enter marks scored in Science out of 100");
    m2=sc.nextInt();
    System.out.println("Enter marks scored in English out of 100");
    m3=sc.nextInt();
    System.out.println("Enter marks scored in Computer out of 100");
    m4=sc.nextInt();
    System.out.println("Enter marks scored in Social Science out of 100");
    m5=sc.nextInt();

    totalmarks=m1+m2+m3+m4+m5;

    int avgpercent= (totalmarks/5);


    if(avgpercent>=90){
        System.out.println("Grade - 'O' Total marks-"+totalmarks+"  Average Percentage-"+avgpercent);
    }

    else if( avgpercent>=80){
        System.out.println("Grade - 'E' Total marks-"+totalmarks+"  Average Percentage-"+avgpercent);
    }
    else if(avgpercent>=70){
        System.out.println("Grade - 'A' Total marks-"+totalmarks+"  Average Percentage-"+avgpercent);
    }
    else if( avgpercent>=60){
        System.out.println("Grade - 'B' Total marks-"+totalmarks+"  Average Percentage-"+avgpercent);
    }
    else if( avgpercent>=50){
        System.out.println("Grade - 'C' Total marks-"+totalmarks+"  Average Percentage-"+avgpercent);
    }
    else if( avgpercent>=40){
        System.out.println("Grade - 'D' Total marks-"+totalmarks+"  Average Percentage-"+avgpercent);
    }
    else{
        System.out.println("Grade - 'F' Total marks-"+totalmarks+"  Average Percentage-"+avgpercent);
    }
    
}
}