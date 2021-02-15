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
public class HolidayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Resort r1 = new Resort("Dan Smith ", 3344, 10, 3.5);
        System.out.println(r1.showDetails());
        
        Resort r2 = new Resort("Lisa Mohn ", 5386, 12, 3.2);
        System.out.println(r2.showDetails());
        
        Hotel h1 = new Hotel(1, "Sausages", "Sean Morgan ", 6671, 8, 4.0);
        System.out.println(h1.hotelDetails());
        
        Cottages c1 = new Cottages("dublin@gaeilge.com", '5', "Evan Brook ", 4278, 7, 3.1);
        System.out.println();
        
        System.out.println("Polymorphism Examples");
        System.out.println(h1.showDetails());
        System.out.println(r1.showDetails());
        
        System.out.println("Polymorphism Examples using super inside a method");
        h1.details();
        r1.details();
    }
    
}
