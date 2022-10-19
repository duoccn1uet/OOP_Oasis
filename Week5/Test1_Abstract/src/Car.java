public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Constructor.
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Get car's information.
     */
    public String getInfo() {
        String res = "Car:\n";
        res += "\tBrand: " + brand + "\n";
        res += "\tModel: " + model + "\n";
        res += "\tRegistration Number: " + registrationNumber + "\n";
        res += "\tNumber of Doors: " + numberOfDoors + "\n";
        res += "\tBelongs to " + owner.getName() + " - " + owner.getAddress();
        return res;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
