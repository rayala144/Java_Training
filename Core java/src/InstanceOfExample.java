
public class InstanceOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("Almighty");
		if (str instanceof String) {
			System.out.println("Stringuu..stringuuu " + str);
		}
		
		InstanceOfExample obj = new InstanceOfExample();
		if (obj instanceof InstanceOfExample) {
			System.out.println("Obj belongs to InstanceOfExample class");
		}
		else if(obj instanceof Object) {
			System.out.println("GODDDDDDD.....");
		}
		else {
			System.out.println("No");
		}

	}

}
