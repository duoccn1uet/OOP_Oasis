import java.util.ArrayList;
import java.util.List;

public class Person {
    protected String name;
    protected String address;
    protected List<Vehicle> vehicleList = new ArrayList<>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * Remove vehicle with registration number.
     * @param registrationNumber registration number
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size();) {
            String userNumber = vehicleList.get(i).getRegistrationNumber();
            if (userNumber.equals(registrationNumber)) {
                vehicleList.remove(i);
            } else {
                ++i;
            }
        }
    }

    /**
     * Get vehicle's information.
     * @return vehicle's information
     */
    public String getVehiclesInfo() {
        if (vehicleList.size() == 0) {
            return name + " has no vehicle!";
        }
        String res = name + " has:\n\n";
        for (Vehicle vehicle : vehicleList) {
            res += vehicle.getInfo() + "\n";
        }
        return res;
    }
}
