package com.Task1;


public class Measurements {
	
	static float cm_to_inch(float cm) {
		return (cm * 0.393701f);
	}
	
	static float inch_to_feet(float inch) {
		return (float)(inch/12);
	}
	
	static float feet_to_metres(float feet) {
		return (float)(feet * 0.3048f);
	}
	
	static float m_to_km(float mts) {
		return (float)(mts/1000);
	}
	
	static float km_to_miles(float km) {
		return (float)(km/1.69f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
