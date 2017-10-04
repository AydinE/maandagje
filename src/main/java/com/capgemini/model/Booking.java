package com.capgemini.model;

import java.time.LocalDateTime;

public class Booking {

    private int bookingNr;
    private Mens mens;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Booking(int bookingNr, Mens mens, LocalDateTime startDate, LocalDateTime endDate){

        this.bookingNr = bookingNr;
        this.mens = mens;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public int getBookingNr() {
        return bookingNr;
    }

    public void setBookingNr(int bookingNr) {
        this.bookingNr = bookingNr;
    }

    public Mens getMens() {
        return mens;
    }

    public void setMens(Mens mens) {
        this.mens = mens;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }


}

