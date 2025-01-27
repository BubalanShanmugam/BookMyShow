package BMS;

import java.util.ArrayList;

public class User {//User pojo class
    String name ;//usernmae of the user
    int pass;//password of the user
    String location ;//location for the user
    private ArrayList<Tickets> ticket = new ArrayList<>();//ticketlist to store the ticket object.

    //constructor to the User class to instializ ethe username,pass and location.
    public User(String name,int pass,String location){
        this.name=name;
        this.pass=pass;
        this.location=location;
    }

    //gettors for the location,ticket,name and pass
    public String getLocation(){ return location;}
    public ArrayList<Tickets> getTicket() {return ticket;}
    public String getName() {
        return name;
    }
    public int getPass() {
        return pass;
    }

    //settor for the location.
    public void setLocation(String location){
        this.location=location;
    }
}
