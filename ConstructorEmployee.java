package OopsConcepts;

public class ConstructorEmployee {
		int empId;  
	    String empName;  
		    
	   ConstructorEmployee(int id, String name){  
	       this.empId = id;  
	       this.empName = name;  
	   }  
	   void info(){
	        System.out.println("Id: "+empId);
	        System.out.println("Name: "+empName);
	   }  
		public static void main(String args[]){  
		ConstructorEmployee emp = new ConstructorEmployee(100,"Sankar");  
		ConstructorEmployee emp1 = new ConstructorEmployee(200,"Santhosh");  
		emp.info();  
		emp1.info();  
}
}