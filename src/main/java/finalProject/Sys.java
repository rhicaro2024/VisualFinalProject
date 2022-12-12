/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalProject;

/**
 *
 * @author raphaelhicaro
 */
public class Sys {
    public String pod;
        
    public Sys(String pod){
        this.pod = pod;
    }
    
    public String getPod(){ //returns the part of the day (day [d], night [n])
        return this.pod;
    }
}
