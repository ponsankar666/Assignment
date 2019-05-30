package OopsConcepts;

public class MethodOverriding extends MethodOverloading{
	void studentId(int i,float f)
	{
		System.out.println("The student id is" +i);
		System.out.println("The student id is" +f);
	}
	public static void main(String[] args) {
		MethodOverriding mo=new MethodOverriding();
		mo.studentId(100, 222.33f);
		mo.studentId(10000);
		
		
	}
}
