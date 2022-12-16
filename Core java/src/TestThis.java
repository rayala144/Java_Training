
public class TestThis {
	
	int empID;
	String empName;
	
	public TestThis() {
		// TODO Auto-generated constructor stub
		this(1001, "Akhil");
		System.out.println("Constructor is executed");
	}
	
	TestThis(int a, String b){
		empID = a;
		empName = b;
	}


	@Override
	public String toString() {
		return "TestThis [empID=" + empID + ", empName=" + empName + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThis obj = new TestThis();
		System.out.println(obj.toString());
	}

}
