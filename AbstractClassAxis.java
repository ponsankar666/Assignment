package OopsConcepts;

public  class AbstractClassAxis extends AbstractClassHdfc{

	@Override
	public void savings() {
		System.out.println("Savings Account");		
	}

	@Override
	public void JointAcc() {
		System.out.println("Joint Account");
	}

	@Override
	public void salary() {
		System.out.println("Salary Account");
	}
	public static void main(String[] args) {
		AbstractClassAxis  ax=new AbstractClassAxis();
		ax.savings();
		ax.JointAcc();
		ax.salary();
	}
	
}
