package com.BusReservationSystem;

public class BusReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketCounter ticketCounter = new TicketCounter();
		TicketBookingThread t1 = new TicketBookingThread(ticketCounter, "Akhil", 2);
		TicketBookingThread t2 = new TicketBookingThread(ticketCounter, "Sridhar", 2);
		
		t1.start();
		t2.start();

	}

}
