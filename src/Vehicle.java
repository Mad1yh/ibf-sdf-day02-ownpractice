public class Vehicle implements Movable{
    // Attributes of the class
    private String color;
    private int capacity;
    private String licensePlateNo;
    private String year;
    private String model;
    private String make;
    private Boolean started;
    private Boolean wiperSwiped;

    // Default Constructor
    public Vehicle() {
    }

    // Constructor with parameters
    public Vehicle(String color, int capacity, String licensePlateNo, String year, String model, String make) {
        this.color = color;
        this.capacity = capacity;
        this.licensePlateNo = licensePlateNo;
        this.year = year;
        this.model = model;
        this.make = make;
    }

    // Generate Getters and Setters from source action
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLicensePlateNo() {
        return licensePlateNo;
    }

    public void setLicensePlateNo(String licensePlateNo) {
        this.licensePlateNo = licensePlateNo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Boolean getStarted() {
        return started;
    }

    public Boolean getWiperSwiped() {
        return wiperSwiped;
    }

    // Generate toString from source action
    @Override
    public String toString() {
        return "Vehicle [color=" + color + ", capacity=" + capacity + ", licensePlateNo=" + licensePlateNo + ", year="
                + year + ", model=" + model + ", make=" + make + "]";
    }

    // Methods: Functions for defining the class behaviour
    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public void honk() {
        System.out.println("Beep...Beep...");
    }

    public void stopSwipe() {
        this.wiperSwiped = false;
    }

    @Override
    public void moveForward() {
        System.out.println("Vehicle is moving forward...");
    }
    @Override
    public void moveBackward() {
        System.out.println("Vehicle is moving backward...");
    }

    @Override
    public void moveLeft() {
       System.out.println("Vehicle is moving leftward...");
    }

    @Override
    public void moveRight() {
        System.out.println("Vehicle is moving rightwards...");
        
    }

    

    
}
