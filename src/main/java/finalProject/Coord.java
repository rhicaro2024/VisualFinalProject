/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalProject;

/**
 *
 * @author raphaelhicaro
 */
public class Coord { //same as json now
    private double lat;
    private double lon;

    
    public Coord(double lat, double lon){
        this.lat = lat;
        this.lon = lon;
    }
    public double getLat(){ //returns the latitude
        return this.lat;
    }

    public double getLon(){ //returns the longitude
        return this.lon;
    }
}
