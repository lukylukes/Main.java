package com.engeto;

import java.util.List;

public class listOfBookings {
    private List<Booking> bookingList;

    ///region
    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }
    ///endregion


    public listOfBookings(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }
}
