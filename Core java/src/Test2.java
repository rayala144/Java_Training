import java.util.Scanner;

class Example2 {
	void getTable(int num) {
	for(int i = 1; i <= 10; i++) {
		System.out.println(num+" * "+i+" = "+num*i);
		}
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int k = sc.nextInt();
		Example2 obj = new Example2();
		obj.getTable(k);
	}

}
