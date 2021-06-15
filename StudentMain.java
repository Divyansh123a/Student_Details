import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code here
		System.out.println("Enter Student's Id:");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student's Name:");
		String b = sc.nextLine();
		System.out.println("Enter Student's Address");
		String c= sc.nextLine();
		while(true)
		{
		    System.out.println("Weather the student is from NIT(Yes/No)");
		    String d = sc.nextLine();
		    if(d.equalsIgnoreCase("Yes"))
		    {
		        Student obj = new Student(a,b,c);
		        System.out.println("Student id:"+obj.getStudentId());
		        System.out.println("Student Name:"+obj.getStudentName());
		        System.out.println("Address:"+obj.getStudentAddress());
		        System.out.println("College Name"+obj.getCollegeName());
		        break;
		    }
		    else if(d.equalsIgnoreCase("No"))
		    {
		        System.out.println("Enter the college Name");
		        String e = sc.nextLine();
		        Student obj1 = new Student(a,b,c,e);
		        System.out.println("Student Id:"+obj1.getStudentId());
		        System.out.println("Student name:"+obj1.getStudentName());
		        System.out.println("Address:"+obj1.getStudentAddress());
		        System.out.println("College name:"+obj1.getCollegeName());
		        break;
		    }
		    else
		    {
		        System.out.println("Wrong Input");
		    }
		}
	}

}
