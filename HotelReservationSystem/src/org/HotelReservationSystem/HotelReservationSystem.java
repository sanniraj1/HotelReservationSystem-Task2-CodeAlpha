package org.HotelReservationSystem;

import java.util.Scanner;

public class HotelReservationSystem {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Hotel hotel = new Hotel();
		while (true) {
			System.err.println("Welcome in Hotel Reservation System");
			System.out.println("Press 1 for  Display Available Rooms");
			System.out.println("Press 2 for Make Reservation");
			System.out.println("Press 3 for View Reservation Details");
			System.out.println("Press 4 Exit Hotel Reservation System");

			System.out.print("Enter your choice (1-4): ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				hotel.displayAvailableRooms();
				break;
			case 2:
				System.out.print("Enter your name: ");
				String guestName = scanner.next();
				hotel.displayAvailableRooms();
				System.out.print("Enter the room number you want to reserve: ");
				int roomNumber = scanner.nextInt();
				Reservation reservation = hotel.makeReservation(guestName, roomNumber);
				if (reservation != null) {
					System.err.println("Reservation successful! Your reservation number is: "
							+ reservation.getReservationNumber());
				} else {
					System.err.println("Failed to make reservation. The selected room is not available.");
				}
				break;
			case 3:
				System.err.print("Enter your reservation number: ");
				int reservationNumber = scanner.nextInt();
				hotel.displayReservationDetails(reservationNumber);
				break;
			case 4:
				System.err.println("Thank you for using the Hotel Reservation System!");
				System.exit(0);
			default:
				System.err.println("Invalid choice. Please enter a number between 1 and 4.");
			}
		}
	}
}
