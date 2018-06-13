package brushup;

import java.util.Scanner;

public class Doctor {
	//declaration of data members
	String name, spec,hospital;
	float exp;
	int fee;
	
	//method define
	 void InputDoctorInfo() {
	 Scanner sc1=new Scanner(System.in);
	 Scanner sc2=new Scanner(System.in);
	 
	 System.out.println("# Dr. info #");
	 
	 System.out.println(" name ");
	 name=sc1.next();
	 System.out.println("spec. ");
	 spec=sc1.next();
	 System.out.println(" hospital ");
	 hospital=sc1.next();
	 System.out.println("exp ");
	 exp=sc2.nextFloat();
	 System.out.println(" fee ");
	 fee=sc2.nextInt();
 }	
	 void ShowDoctorInfo() {
		 System.out.println("# doc info #");
		 System.out.println("spec "+spec);
		 System.out.println("hospital "+hospital);
		 System.out.println("exp "+exp+" years");
		 System.out.println("fee "+fee+" INR");
		 System.out.println("<--------------------------------->");
		 
	 }
	 public static void main(String[] args) {
		
		 //create object of dr.
		 Doctor d1 = new Doctor();
		 Doctor d2 = new Doctor();
		 Doctor d3 = new Doctor();
		 
		 // method call
		 
		 //store data inside d1
		 d1.InputDoctorInfo();
		 d2.InputDoctorInfo();
		 d3.InputDoctorInfo();
		 
		 //fetch the data from d1
		 d1.ShowDoctorInfo();
		 d2.ShowDoctorInfo();
		 d3.ShowDoctorInfo();
	}
	 

}
