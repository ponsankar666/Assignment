package OopsConcepts;

public class MethodOverloading {
	void studentID()
	{
		System.out.println("The student id is"+ 10);
	}
	void studentId(int i)
	{
		System.out.println("The student id is" +i);
	}
	void studentId(String s) {
		System.out.println("The student id is" +s);
	}
	void studentId(int i,float f) {
		System.out.println("The student id is" +i);
		System.out.println("The student id is" +f);
	}
	public static void main(String[] args)
	{
		MethodOverloading mo=new MethodOverloading();
		mo.studentID();
		mo.studentId(100);
		mo.studentId("Sankar");
		mo.studentId(10, 20.5f);
	
	}
	
}

