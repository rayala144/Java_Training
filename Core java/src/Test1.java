
class Example1 {
	public int get(int x) {
		System.out.println("Square of the number:");
		return (x*x);
	}
}



public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj = new Example1();
		
		for(int i = 0; i <= 10; i++) {
			int j = obj.get(i);
			System.out.println("Value of j: "+j);
		}

	}

}
