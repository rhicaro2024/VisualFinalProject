/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalProject;

/**
 *
 * @author raphaelhicaro
 */
public class Location {
    private String name;
    private double lat;
    private double lon;
    private String country;
    private String state;

    Location(String name, double lat, double lon, String country, String state){
        this.name = name;
        this.lat = lat;
        this.lon = lon;      
        this.country = country;
        this.state = state;        
    }
    
    public String getName() { 
    return this.name; 
    }

    public double getLat() { 
    return this.lat; 
    }

    public double getLon() { 
    return this.lon; 
    }

    public String getCountry() { 
    return this.country; 
    }

    public String getState() { 
    return this.state; 
    }
}
