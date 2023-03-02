package com.engeto;

import java.time.LocalDate;

public class Booking {

    private Room room;
    private Guest guest;
    private LocalDate startDay;
    private LocalDate endDay;
    private boolean isRecreation;




    ///region
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
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

    ///endregion


    public Booking(Room room, Guest guest,
                   LocalDate startDay, LocalDate endDay, boolean isRecreation) {
        this.room = room;
        this.guest = guest;
        this.startDay = startDay;
        this.endDay = endDay;
        this.isRecreation = isRecreation;
    }
}
