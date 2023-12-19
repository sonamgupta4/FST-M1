package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car tataNexon = new Car();
        tataNexon.make = 2014;
        tataNexon.color = "Black";
        tataNexon.transmission = "Manual";
        tataNexon.displayCharacteristics();
        tataNexon.accelerate();
        tataNexon.brake();
    }

}
