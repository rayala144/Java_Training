
class Example{
	public void getData() {
		for(int j = 0; j <= 9; j++) {
			System.out.println(j);
			System.out.println("-----------");
		}
	}
}

public class test {
	public static void main (String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		Example objExample = new Example();
		objExample.getData();
	}
}