package oops;

public class Company {
	
	public static void main(String[] args) {
		
		Employee ramesh = new Employee(100,"ramesh",9837492,"hyderabad");
		
		Employee suresh = new Employee(101,"suresh",923847,"chennai");
		
		Employee naresh = new Employee(102,"naresh",932874,"bnglr");
		
		Employee mahesh = new Employee(103,"mahesh",987329,"kolkata");
		
		System.out.println(ramesh.toString());
		
		System.out.println(suresh);
		
		System.out.println(naresh);
		
		System.out.println(mahesh);
	}

}
