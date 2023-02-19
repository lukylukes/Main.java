package com.engeto;

import java.time.LocalDate;

public class Booking {

    private int numberOfRoom;
    private int guest;
    private LocalDate startDay;
    private LocalDate endDay;
    private boolean isRecreation;




    ///region
    public int getRoom() {
        return numberOfRoom;
    }

    public void setRoom(int room) {
        this.numberOfRoom = room;
    }

    public int getGuest() {
        return guest;
    }

    public void setGuest(int guest) {
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


    public Booking(int room, int guest,
                   LocalDate startDay, LocalDate endDay, boolean isRecreation) {
        this.numberOfRoom = room;
        this.guest = guest;
        this.startDay = startDay;
        this.endDay = endDay;
        this.isRecreation = isRecreation;
    }
}
