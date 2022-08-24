package com.utopia;
import java.sql.Date;
import java.sql.*;

public class Flight{

    Integer flightID;
    Integer routeID;
    Integer airplaneID;
    Date departureTime;
    Date arrivalTime;
    Integer reservedSeats;
    Float price;


    public Flight(int id, int route, Date dtd, Date dta, int seat, Float pri){
        this.flightID = id;
        this.routeID = route;
        this.departureTime = dtd;
        this.arrivalTime = dta;
        this.reservedSeats =seat;
        this.price = pri;
    }

    public Flight(int route, Date dt, int seat, Float pri){
        this.flightID = -1;
        this.routeID = route;
        this.departureTime = dt;
        this.reservedSeats =seat;
        this.price = pri;
    }
    public static String read(){
        return"SELECT * FROM tbl_flight";
    }

    public static Integer  getPlane(Statement dbS, Integer aid) throws SQLException{
        ResultSet result = dbS.executeQuery("SELECT max_capacity FROM airplane_type WHERE id=" + aid.toString());
        return result.getInt("max_capacity");
    }

    public static String[] getroute(Statement dbS, Integer rid) throws SQLException{
        ResultSet result = dbS.executeQuery("SELECT departCityId, arriveCityId FROM tbl_flight_details WHERE flightNumber=" + rid.toString());
        String[] answer = new String[2];
        while(result.next()){
            answer[0] = result.getString("departCityId");
            answer[1] = result.getString("arriveCityId");
        }
        return answer;
    }

    public static String[] getDates(Statement dbS, Integer flid) throws SQLException{
        ResultSet result = dbS.executeQuery("SELECT departCityId, arriveCityId FROM tbl_flight_details WHERE flightNumber=" + flid.toString());
        String[] answer = new String[2];
        while(result.next()){
            answer[0] = result.getString("departCityId");
            answer[1] = result.getString("arriveCityId");
        }
        return answer;
    }

    public String add(){
        if(this.flightID == -1){
        return "INSERT INTO tbl_flight \nVALUES (" + this.routeID.toString() + ", " + this.airplaneID.toString() + ", " + this.departureTime.toString() + ", " + this.reservedSeats.toString() + ", " + this.price.toString() + ");";
        }
        else return "";
    }
    public String update(){
        if(this.flightID == -1){
            return "";
        }
        else{
            return "UPDATE tbl_flight\nSET ROUTE_ID = " + this.routeID.toString() + ", AIRPLANE_ID = " + this.airplaneID.toString() + ", DEPARTURE_TIME = " + this.departureTime.toString() + ", RESERVED_SEATS = " + this.reservedSeats.toString() + ", SEAT PRICE =" + this.price.toString() + ")\nWHERE ID = " + this.flightID.toString() +";";
        }

    }
    public String delete(){
        if(this.flightID == -1){
            return "";
        }
        else{
            return "DELETE FROM tbl_flight WHERE ID = " +this.flightID.toString();
        }

    }
    @Override
    public String toString(){
        return flightID.toString() + " " + routeID.toString() + " " + airplaneID.toString() + " " + departureTime.toString() + " " + reservedSeats.toString() + " " + price.toString();

    }
}


//VALUES ("1","2022-9-28 10:00.000","60","100","2022-9-28 16:00.000","1001")