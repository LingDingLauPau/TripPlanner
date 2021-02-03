package com.kea;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu.menu();
    }

    /**
     * @Author Kasper Jensen
     *
     */
    public static class Trip {
        static String country;
        static int duration;
        static int temperature;
        static int pax;

    public Trip(String country, int duration, int temperature, int pax) {
        this.country = country;
        this.duration = duration;
        this.temperature = temperature;
        this.pax = pax;
        }

        public Trip() {

        }
    }

    /**
     * subclass that inherits fields from superclass Trip
     */
    public class SkiTrip extends Trip{
        private String temperature;

        public SkiTrip(String country, int duration, int temperature, int pax) {
            super(country, duration, temperature, pax);
        }

        /**
         * setter and getter for SkiTrip String temperature
         * @return temperature
         */
        public String getTemperature(){
            return temperature;
        }

        public void setTemperature(){
            this.temperature = temperature;
        }

    }

    /**
     * subclass that inherits fields from superclass Trip
     */
    public class BeachTrip extends Trip{
        private String temperature;

        public BeachTrip(String country, int duration, int temperature, int pax) {
            super(country, duration, temperature, pax);
        }

        /**
         * setter and getter for SkiTrip String temperature
         * @return temperature
         */
        public String getTemperature(){
            return temperature;
        }

        public void setTemperature(String temperature){
            this.temperature = temperature;
        }

    }

    /**
     * generic menu class
     */
    public static class Menu{

        /**
         * Menu Method
         */
        public static void menu(){
            boolean printMenu = true;
            int n;
            int nReal = -1;

            while(printMenu) {
                System.out.println("TRIP PLANNER MENU\n1.Create trip\n2.List trip\n3.Exit");
                Scanner scn = new Scanner(System.in);
                n = scn.nextInt();
                if (n >= 1) { //checks if n is positive
                    nReal = n;
                } else {
                    System.out.println("Please write a positive number:");
                    printMenu = true;
                }

                switch (nReal) {
                    case 1:
                        System.out.println("Creating new trip\n");
                        List.AddList();
                        break;
                    case 2:
                        System.out.println("Listing trips\n");
                        //List.ShowList();
                        break;
                    default:
                        System.exit(0);
                }
            }
        }
    }

    public static class List{
        @Override
        public String toString() {
            return "Vacation Location: " + Trip.country + ", Length of Vacation: " + Trip.duration + ", Desired Temperature: " + Trip.temperature + ", Amount of travelers: " + Trip.pax + "\n";
        }
        public static void AddList(){
            ArrayList<Trip> trip = new ArrayList<Trip>();
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter the name of your destination: ");
            Trip.country = input.nextLine();
            System.out.println("Please enter the amount of days you will be on vacation: ");
            Trip.duration = input.nextInt();
            System.out.println("Please enter the desired temperature: ");
            Trip.temperature = input.nextInt();
            System.out.println("Please enter the amount of people traveling: ");
            Trip.pax = input.nextInt();
            
            trip.add(new Trip(Trip.country, Trip.duration, Trip.temperature, Trip.pax));
            for (int i = 0; i < trip.size(); ++i) {
                String list = trip.toString();
                System.out.println("Lol" + list);
            }

        }



        }

        public static void ShowList(){ //ToString Method needed


    }
}
