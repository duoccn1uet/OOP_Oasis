public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Constructor.
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    /**
     * Get motorbike's information.
     */
    public String getInfo() {
        String res = "Motor Bike:\n";
        res += "\tBrand: " + brand + "\n";
        res += "\tModel: " + model + "\n";
        res += "\tRegistration Number: " + registrationNumber + "\n";
        res += "\tHas Side Car: " + hasSidecar + "\n";
        res += "\tBelongs to " + owner.getName() + " - " + owner.getAddress();
        return res;
    }
}
