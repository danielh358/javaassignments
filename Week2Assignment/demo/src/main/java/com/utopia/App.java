package com.utopia;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Utopia Airlines CLI Interface/
 */
public final class App {
    private App() {
    }

    /**
     * Utopia CLI
     * @param args The arguments of the program. None implemented.
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Scanner input = new Scanner(System.in);
        int prompt = -1;
        String prompt2;
        Connection dbconnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/utopia?useSSL=false", "root", "root");
        Statement state = dbconnect.createStatement();
        ResultSet result;

       
        while(true){
            System.out.print("Welcome to Utopia Airlines Management System.\nWhich type of user are you?\n1)Traveller\n2)Agent\n3Admin\nOr enter -1 to quit\n");
            try{
                prompt = input.nextInt();
            }

            catch(InputMismatchException e){
                System.out.print("Please enter an integer input.\n");
                continue;
            }

            if(-1 <= prompt && prompt <=3 && prompt !=0){
                //pass
            }

            else{
                System.out.print("Please enter an appropriate value.\n");
                continue;
            }
            if(prompt == -1) break;
            while(true){
            

            if(prompt == 1){
                System.out.print("Welcome Employee. Enter choice below:\n1)Enter Flights You Manage\n2)Quit to Previous\n");
                
                try{
                    prompt = input.nextInt();
                }
    
                catch(InputMismatchException e){
                    System.out.print("Please enter an integer input.\n");
                    continue;
                }
    
                if(prompt == 1 || prompt == 2){
                    //pass
                }
    
                else{
                    System.out.print("Please enter an appropriate value.\n");
                    continue;
                }
                if(prompt == 2) break;
                if(prompt == 1){
                    System.out.print("List of Flights. Select one.\n");
                    result = state.executeQuery(Flight.read());
                    ArrayList<Flight> flightlist= new ArrayList<Flight>();
                    while(result.next()){
                        //public Flight(int id, int route, int plane, LocalDateTime dt, int seat, int pri)
                        //from row of Flight table
                        Flight temp = new Flight(
                            result.getInt("flightId"), 
                            result.getInt("flightNumber"),
                            result.getDate("departTime"),
                            result.getDate("arrivalTime"),
                            result.getInt("seatsAvailable"),
                            result.getFloat("price")
                            );
                        flightlist.add(temp);
                    }
                    Integer index = 1;
                    for( Flight item : flightlist){
                        //get airplane and route info
                        //int capacity = Flight.getPlane(state, item.airplaneID);
                        String[] route = Flight.getroute(state, item.routeID);
                        System.out.print(index.toString() + ") " + route[0] + " -> " +route[1] +"\n");
                        index++;

                    }
                    System.out.print(index.toString() +") Quit to previous\n");
                    System.out.print("Enter a selection: ");
                    int selection = input.nextInt();
                    if(selection == index) break;
                    if(selection >flightlist.size()){
                        System.out.print("\nError in input.");
                        break;
                    }
                    while(true){
                        System.out.print("\n1)View more details about the flight\n2)Update Details of the Flight\n3)Add Seats to Flight\n4)Back to previous\n");
                        try{
                            prompt = input.nextInt();
                        }
                        catch(InputMismatchException e) {
                            System.out.println("Error, please enter a number 1 to 4.");
                            continue;

                        }
                        if(prompt == 1){
                            System.out.println("Flight Details:");
                            String[] route = Flight.getroute(state, flightlist.get(selection).routeID);
                            System.out.print("Departure Airport: " + route[0] + "| Arrival Airport: " +route[1] +"\n" );
                            System.out.print("Departure Date and Time: " + flightlist.get(selection).departureTime.toString());
                            System.out.print("\nArrival Date and Time: " +flightlist.get(selection).arrivalTime.toString());
                            System.out.print("\nSeats Available: " +flightlist.get(selection).reservedSeats);
                            System.out.print("\nPress enter to return.\n");
                            input.nextLine();
                            
                        }

                        if(prompt == 2){
                            System.out.print("You have chosen to update flight " +flightlist.get(selection).flightID.toString() + "\n");
                            System.out.print("Please enter a new origin Airport.");
                            String updateOrigin;
                            String updateDest;
                            String updateDepart;
                            String updateArrival;
                            try{
                                updateOrigin = input.nextLine();
                            }
                            catch(InputMismatchException e){
                                System.out.println("Error in value.");
                                continue;
                            }
                            System.out.print("Please enter a new destination Airport.");
                            try{
                                updateDest = input.nextLine();
                            }
                            catch(InputMismatchException e){
                                System.out.println("Error in value.");
                                continue;
                            }
                            System.out.print("Please enter a new departure date and time in format YYYY-DD-MM HH-mm-SS.");
                            try{
                                updateDepart = input.nextLine();
                            }
                            catch(InputMismatchException e){
                                System.out.println("Error in value.");
                                continue;
                            }
                            System.out.print("Please enter a new arrival date and time in format YYYY-DD-MM HH-mm-SS.");
                            try{
                                updateArrival = input.nextLine();
                            }
                            catch(InputMismatchException e){
                                System.out.println("Error in value.");
                                continue;
                            }
                            


                        }
                        
                    }

                }

            }
        }
        
        

        }

        input.close();
    }
}
