package com.BusReservationSystem;

public class TicketCounter {
	
	private int availableSeats = 3;
	
	public synchronized void BookTicket(String pass_name, int numberOfSeats) {
		if ((availableSeats >= numberOfSeats) && (numberOfSeats > 0)) {
			System.out.println("Hi "+pass_name+", you have booked "+numberOfSeats+" seats successfully!");
			availableSeats = availableSeats - numberOfSeats;
		}
		else {
			System.out.println("Hi "+pass_name+", we are sorry to inform you that seats are not available");
		}
		
	}


}
