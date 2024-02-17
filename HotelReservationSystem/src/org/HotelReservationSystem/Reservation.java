package org.HotelReservationSystem;

public class Reservation {
	private int reservationNumber;
	private String guestName;
	private Room bookedRoom;

	public Reservation(int reservationNumber, String guestName, Room bookedRoom) {
		this.reservationNumber = reservationNumber;
		this.guestName = guestName;
		this.bookedRoom = bookedRoom;
	}

	public int getReservationNumber() {
		return reservationNumber;
	}

	public String getGuestName() {
		return guestName;
	}

	public Room getBookedRoom() {
		return bookedRoom;
	}
}
