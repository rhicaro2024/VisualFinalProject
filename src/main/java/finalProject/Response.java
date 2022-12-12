/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalProject;

/**
 *
 * @author raphaelhicaro
 */
public class Response { //same as json format
    private String cod;
    private int message;
    private int cnt;
    private Info[] list; 
    private City city;
    
    Response(String cod, int message, int cnt, Info[] list, City city) {
        this.cod = cod;
        this.message = message;
        this.cnt = cnt;
        this.list = list;
        this.city = city;
    }
    
    public String getCod(){
        return this.cod;
    }
    public int getMsg(){
        return this.message;
    }
    public int getCnt(){
        return this.cnt;
    }
    public Info[] getList(){
        return this.list;
    }
    public City getCity(){
        return this.city;
    }
}
