package org.HotelReservationSystem;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private static List<Room> rooms;
	private List<Reservation> reservations;
	private int reservationCounter;

	public Hotel() {
		rooms = new ArrayList<>();
		reservations = new ArrayList<>();
		reservationCounter = 1;
		rooms.add(new Room(101, "Standard", 3000.0));
		rooms.add(new Room(102, "Deluxe", 5000.0));
		rooms.add(new Room(103, "Suite", 8000.0));
	}

	public void displayAvailableRooms() {
		System.err.println("Welcome !..");
		System.out.println("Available Rooms:");
		for (Room room : rooms) {
			if (room.isAvailable()) {
				System.out.println("Room " + room.getRoomNumber() + " - " + room.getCategory() + " - Rs "
						+ room.getPrice() + " per night");
			}
		}
		System.err.println("Thank you for using Hotel Reservation System");

	}

	public Reservation makeReservation(String guestName, int roomNumber) {
		for (Room room : rooms) {
			if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
				room.bookRoom();
				Reservation reservation = new Reservation(reservationCounter++, guestName, room);
				reservations.add(reservation);
				return reservation;
			}
		}
		return null;
	}

	public void displayReservationDetails(int reservationNumber) {
		for (Reservation reservation : reservations) {
			if (reservation.getReservationNumber() == reservationNumber) {
				System.out.println("Reservation Details:");
				System.out.println("Reservation Number: " + reservation.getReservationNumber());
				System.out.println("Guest Name: " + reservation.getGuestName());
				System.out.println("Room Number: " + reservation.getBookedRoom().getRoomNumber());
				System.out.println("Room Category: " + reservation.getBookedRoom().getCategory());
				System.out.println("Room Price: $" + reservation.getBookedRoom().getPrice() + " per night");
				return;
			}
		}
		System.out.println("Reservation not found.");
	}
}
