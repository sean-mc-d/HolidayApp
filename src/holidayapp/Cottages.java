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
public class Cottages extends Resort{
    protected String address;
    protected char keyCollectionPoint;

    public Cottages(String address, char keyCollectionPoint, String clientName, int bookingReference, int startDate, double duration) {
        super(clientName, bookingReference, startDate, duration);
        this.address = address;
        this.keyCollectionPoint = keyCollectionPoint;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getKeyCollectionPoint() {
        return keyCollectionPoint;
    }

    public void setKeyCollectionPoint(char keyCollectionPoint) {
        this.keyCollectionPoint = keyCollectionPoint;
    }
    
    public String cottagesDetails(){
        return "clientName: " +clientName+ "bookingReference: " +bookingReference+ "startDate: " +startDate+ "duration: " +duration+ "address: " +address+ "keyCollectionPoint: " +keyCollectionPoint;
    }
}
