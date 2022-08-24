package com.utopia;

public class Passenger {
    int PassengerID;
    String confirmationCode;
    Integer bookingID;
    String givenName;
    String familyName;
    String gender;
    String address;

    public Passenger(int PassID, String cCode, int bookID,  String fam, String give, String gen, String addr ){
        this.PassengerID = PassID;
        this.confirmationCode = cCode;
        this.bookingID = bookID;
        this.givenName = give;
        this.familyName = fam;
        this.gender = gen;
        this.address = addr;
    }

    public Passenger(String cCode, int bookID,  String fam, String give, String gen, String addr ){
        this.PassengerID = -1;
        this.confirmationCode = cCode;
        this.bookingID = bookID;
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
