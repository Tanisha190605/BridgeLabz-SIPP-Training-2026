// 2. Drone Delivery System 
// Scenario
// A logistics company uses drones for package delivery.
// Requirements
// Create a class Drone.
// Variables
// Instance:
// droneId
// batteryPercentage
// Static:
// companyName
// Constructor
// Use this keyword to initialize instance variables.
// Methods


// startDelivery()
// displayStatus()
// Create multiple drones and verify that all drones share the same company name.
class Drone{
    int droneId;
    int batteryPercentage;
    static String companyName;
    Drone(int droneId, int batteryPercentage){
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
        this.companyName = "DroneExpress";                  

    }
    void startDelivery(){
        System.out.println("Drone " + droneId + " is starting delivery with battery at " + batteryPercentage + "%.");


    }
    void displayStatus(){
        System.out.println("Drone ID: " + droneId + ", Battery Percentage: " + batteryPercentage + "%, Company Name: " + companyName);
    }
    public 
static void main(String[] args) {
        Drone drone1 = new Drone(101, 85);
        Drone drone2 = new Drone(102, 90);

        drone1.startDelivery();
        drone1.displayStatus();

        drone2.startDelivery();
        drone2.displayStatus();
    }
}