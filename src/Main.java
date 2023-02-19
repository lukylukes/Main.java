import com.engeto.Booking;
import com.engeto.Guest;
import com.engeto.ListOfBookings;
import com.engeto.Room;

import java.math.BigDecimal;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.BlockingDeque;

public class Main {
    public static void main(String[] args) {


        Guest guest1 = new Guest(" Adéla ","Malíková",
                LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest(" Jan ", "Dvořáček",
                LocalDate.of(1995, 5, 5));

        System.out.println("Guest" + guest1.getFirstName() +
                guest1.getLastName() + " is born " + guest1.getBirthDate());
        System.out.println("Guest" + guest2.getFirstName() +
                guest2.getLastName() + " is born " + guest2.getBirthDate());

        Room room1 = new Room(1,1,true,
                true, BigDecimal.valueOf(1000));
        Room room2 = new Room(2,1,true,
                true, BigDecimal.valueOf(1000));
        Room room3 = new Room(3,3,false,
                true, BigDecimal.valueOf(2400));

        System.out.println("Room number " + room1.getNumberOfRoom() + " has " + room1.getNumberOfBeds() +
                " bed" + ", balcony and sea view for " + room1.getPricePerNight() + "Kč/night.");
        System.out.println("Room number " + room2.getNumberOfRoom() + " has " + room2.getNumberOfBeds() +
                " bed" + ", balcony and sea view for " + room2.getPricePerNight() + "Kč/night.");
        System.out.println("Room number " + room3.getNumberOfRoom() + " has " + room3.getNumberOfBeds() +
                " beds" + ", has not balcony but has sea view for " + room3.getPricePerNight() +
                "Kč/night.");


        Booking reservation1 = new Booking(1, 1, LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), true);
        Booking reservation2 = new Booking(3, 2, LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), true);


        ArrayList<Booking> ListOfBookings = new ArrayList<>();
        ListOfBookings.add(reservation1);
        ListOfBookings.add(reservation2);

        System.out.println(ListOfBookings);
    }
}