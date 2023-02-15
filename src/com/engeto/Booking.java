package com.engeto;

import java.time.LocalDate;
import java.util.List;

public class Booking {

    private Room numberOfRoom;
    private Guest guest;
    private List<Guest> otherGuests;
    private LocalDate startDay;
    private LocalDate endDay;
    private boolean isRecreation;
    private boolean isWork;


    ///region
    public Room getRoom() {
        return numberOfRoom;
    }

    public void setRoom(Room room) {
        this.numberOfRoom = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) {
        this.endDay = endDay;
    }

    public boolean isRecreation() {
        return isRecreation;
    }

    public void setRecreation(boolean recreation) {
        isRecreation = recreation;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }
    ///endregion


    public Booking(Room room, Guest guest, List<Guest> otherGuests,
                   LocalDate startDay, LocalDate endDay, boolean isRecreation, boolean isWork) {
        this.numberOfRoom = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
        this.startDay = startDay;
        this.endDay = endDay;
        this.isRecreation = isRecreation;
        this.isWork = isWork;
    }
}
