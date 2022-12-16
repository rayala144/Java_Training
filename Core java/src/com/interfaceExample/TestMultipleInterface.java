package com.interfaceExample;


interface Father{
	float height = 6.1f;
	float weight = 89.3f;
	void childPhysiq();
}

interface Mother{
	float height = 5.7f;
	float weight = 74.2f;
}

class Child implements Father, Mother{
	public void childPhysiq() {
		float height_child = (Father.height + Mother.height) / 2;
		float weight_child = (Father.weight + Mother.weight) / 2;
		System.out.println("Height of child: "+height_child+", Weight of child: "+weight_child);
	}
	
	
}


public class TestMultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child baby = new Child();
		baby.childPhysiq();
	}

}
