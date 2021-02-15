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
public class Hotel extends Resort{
    protected int roomNumber;
    protected String breakfast;

    public Hotel(int roomNumber, String breakfast, String clientName, int bookingReference, int startDate, double duration) {
        super(clientName, bookingReference, startDate, duration);
        this.roomNumber = roomNumber;
        this.breakfast = breakfast;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }
    
    public String hotelDetails(){
        return "clientName: " +clientName+ ", bookingReference: " +bookingReference+ ", startDate: " +startDate+ ", duration: " +duration+ ", roomNumber: " +roomNumber+ ", breakfast: " +breakfast;
    }
    @Override
    public String showDetails(){
         return "clientName: " +clientName+ ", bookingReference: " +bookingReference+ ", startDate: " +startDate+ ", duration: " +duration+ ", roomNumber: " +roomNumber+ ", breakfast: " +breakfast;
    }
    
    @Override
    public void details(){
        super.details(); //do the method from the super class
        System.out.println("And do more from the sub class method");
    }
}
