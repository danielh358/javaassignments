package com.utopia;
import java.time.LocalDateTime;
import java.time.LocalDate;
public class User {

    Integer isActive;
    String confirmationCode;
    Integer bookingID;
    LocalDate departureTime;
    String givenName;
    String familyName;
    String gender;
    String address;

    public User(int id, String cCode, int bookID, LocalDate dt, String fam, String give, String gen, String addr ){
        this.isActive = id;
        this.confirmationCode = cCode;
        this.bookingID = bookID;
        this.departureTime = dt;
        this.givenName = give;
        this.familyName = fam;
        this.gender = gen;
        this.address = addr;
    }

    public User(int id, String cCode, LocalDate dt, String fam, String give, String gen, String addr ){
        this.isActive = id;
        this.confirmationCode = cCode;
        this.bookingID = -1;
        this.departureTime = dt;
        this.givenName = give;
        this.familyName = fam;
        this.gender = gen;
        this.address = addr;
    }

    public String add(){
        if(this.bookingID == -1){
        return "";
        }
        else return "";
    }
    public String update(){
        if(this.bookingID == -1){
            return "";
        }
        else{
            return "";
        }

    }
    public String delete(){
        if(this.bookingID == -1){
            return "";
        }
        else{
            //return "DELETE FROM FLIGHT WHERE ID = " +this.flightID.toString();
            return "";
        }

    }
}
