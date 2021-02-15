/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holidayapp;

/**
 *
 * @author user
 */
public class Resort {
    protected String clientName;
    protected int bookingReference;
    protected int startDate;
    protected double duration;

    public Resort(String clientName, int bookingReference, int startDate, double duration) {
        this.clientName = clientName;
        this.bookingReference = bookingReference;
        this.startDate = startDate;
        this.duration = duration;
    }
    
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getBookingReference() {
        return bookingReference;
    }

    public void setBookingReference(int bookingReference) {
        this.bookingReference = bookingReference;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String showDetails(){
        return "clientName: " +clientName+ ", bookingReference: " +bookingReference+ ", startDate: " +startDate+ ", duration: " +duration;
    }
    
    public void details(){
        System.out.println ("clientName: " +clientName+ ", bookingReference: " +bookingReference+ ", startDate: " +startDate+ ", duration: " +duration+ ", roomNumber: ");
   
    }
}
