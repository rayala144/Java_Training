package com.BusReservationSystem;

public class TicketBookingThread extends Thread {

	private TicketCounter ticketCounter;
	private String passengerName;
	private int noOfSeatsToBook;
	
	
	
	public TicketBookingThread(TicketCounter ticketCounter, String passengerName, int noOfSeatsToBook) {
		super();
		this.ticketCounter = ticketCounter;
		this.passengerName = passengerName;
		this.noOfSeatsToBook = noOfSeatsToBook;
	}
	
	public void run() {
		ticketCounter.BookTicket(passengerName, noOfSeatsToBook);
	}

}
