package brushup;

public class Employer {
	int ID;
	String NAME;
	String Occupatin;
	int Salary;
	public static void main(String[] args) {
		
		Employer a=new Employer();
		Employer b=new Employer();
		Employer c=new Employer();
	//	Employer d=new Employer();
		
		a.ID=435;
		a.NAME="Ram";
		a.Occupatin="front end developer";
		a.Salary=50000;
		
		b.ID=433;
		b.NAME="Shyam";
		b.Occupatin="Back end developer";
		b.Salary=60000;
		
		c.ID=4345;
		c.NAME="jordan";
		c.Occupatin="HR";
		c.Salary=100000;
	/*	
		d.ID=43785;
		d.NAME="magen fox";
		d.Occupatin="Manager";
		d.Salary=200000;
	*/	
		
		
		
		if(a.Salary>b.Salary) {
           	if(a.Salary>c.Salary) {
                     System.out.println("the max salary is"+a.Salary);
                     System.out.println("his ID is "+a.ID);
                     System.out.println("Name is "+a.NAME);
                     System.out.println("occupation is "+a.Occupatin);
                     System.out.println("\n");
                    }else {
                            System.out.println(" max salary is"+c.Salary);
                            System.out.println("his ID is "+c.ID);
                            System.out.println("Name is "+c.NAME);
                            System.out.println("occupation is "+c.Occupatin);
                            System.out.println("\n");
                          
                           }
}else

	   
    if(b.Salary>c.Salary) {
        	System.out.println("the max salary is "+b.Salary);
        	System.out.println("his ID is "+b.ID);
            System.out.println("Name is "+b.NAME);
            System.out.println("occupation is "+b.Occupatin);
            System.out.println("\n");
            }else {
                  System.out.println("the max salary is "+c.Salary);
                  System.out.println("his ID is "+c.ID);
                  System.out.println("Name is "+c.NAME);
                  System.out.println("occupation is "+c.Occupatin);
                  System.out.println("\n");
                	}	

		
		
		if(a.Salary<b.Salary) {
           	if(a.Salary<c.Salary) {
                     System.out.println("the mim salary is "+a.Salary);
                     System.out.println("his ID is "+a.ID);
                     System.out.println("Name is "+a.NAME);
                     System.out.println("occupation is "+a.Occupatin);
                     System.out.println("\n");
                    }else {
                            System.out.println(" mim salary is "+c.Salary);
                            System.out.println("his ID is "+c.ID);
                            System.out.println("Name is "+c.NAME);
                            System.out.println("occupation is "+c.Occupatin);
                            System.out.println("\n");
                           }
}else

	   
    if(b.Salary<c.Salary) {
        	System.out.println("the mim salary is "+b.Salary);
        	System.out.println("his ID is "+b.ID);
            System.out.println("Name is "+b.NAME);
            System.out.println("occupation is "+b.Occupatin);
            System.out.println("\n");
            }else {
                  System.out.println("the mim salary is "+c.Salary);
                  System.out.println("his ID is "+c.ID);
                  System.out.println("Name is "+c.NAME);
                  System.out.println("occupation is "+c.Occupatin);
                  System.out.println("\n");
                	}	

		
	
	}
	
}
