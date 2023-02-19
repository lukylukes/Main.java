package com.engeto;

import java.util.List;

public class ListOfBookings {
    private List<Booking> bookingList;

    ///region
    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }
    ///endregion


    public ListOfBookings(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }
}
