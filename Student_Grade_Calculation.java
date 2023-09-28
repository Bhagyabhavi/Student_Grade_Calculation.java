import java.util.*;
public class Student_Grade_Calculation {
public static void main(String []args)
{
	Scanner sc=new Scanner (System.in);
	
	 int phy,chem,maths,eng,comp;
	 
	 //taking student name from user
	    System.out.println("enter name of the student ");
	    String stud=sc.nextLine();
	    
	  //taking student's class and section from user
	    System.out.print("enter class and section of the student ");
	    String cl=sc.nextLine();
	    
	  //taking student's roll number from user 
	    System.out.print("enter roll number of student");
	    int  rn=sc.nextInt();
	    
	   // taking required subject marks for grade calculation
	    
	    System.out.print("enter marks of physics, chemistry, maths, english, computer \n \n");
		 phy=sc.nextInt();
		 chem=sc.nextInt();
		 maths=sc.nextInt();
		 eng=sc.nextInt();
		 comp=sc.nextInt();
	    
	    
	  //printing student's information
	    
		 System.out.println("\n ");
		 System.out.println("\n ");
		 System.out.println("\n ");

	    System.out.println("************STUDENT  ACADEMIC REPORT *************** ");
	    System.out.println(" ");
	    System.out.println(" ");
	    System.out.println("_______________________________________________________");
	    System.out.println("\nStudent name :- "+stud);
	    System.out.println("class :- "+  cl);
	    System.out.println("roll number :- "+ rn);
	    System.out.println("________________________________________________________");
		
	    display(phy,chem,maths,eng,comp);
	    
	
	sc.close();
}

//This method calculate the marks,percentage and grade by using the above taken marks

public static char calculation(int p,int c,int m,int e,int comp)
{
	
	int sum=p+c+m+e+comp;
	System.out.println("\ntotal marks obtained    "+sum);
	int avg=sum/5;
	System.out.println("\nAverage percentage      "+avg);
	
    if(avg>=90 && avg<=100)
		return'A';
	else if(avg>=80 && avg<90)
		return'B';
	else if(avg>=70 && avg<80)
		return'C';
	else if(avg>=60 && avg<70)
		return'D';
	else if(avg>=50 && avg<60)
		return'E';
	else
		return'F';

}

//This method only displays the subjects with their respective marks 

public static void display(int p,int c,int m,int e,int comp)
{
	char grade;
	System.out.println(" ");
	System.out.println("physics                 "+ p);
	System.out.println("chemistry               "+ c);
	System.out.println("Maths                   "+ m);
	System.out.println("English                 "+ e);
	System.out.println("Computer                "+ comp);
	
	//storing grade with the help of method calculation
	grade=calculation(p,c,m,e,comp);
	
	System.out.println("\nGrade                   "+grade);
	//printing final report whether he is pass or fail
	
	if(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='E')
	System.out.println("\n          *****PASS*****");
	else
	System.out.println("\n          *****FAIL*****");

	
}
}
