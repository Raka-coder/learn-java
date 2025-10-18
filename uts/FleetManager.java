/*
 * NPM: 247006111172
 * Nama: Raka Restu Saputra
 * Kelas: F
 */

import java.util.ArrayList;

public class FleetManager {
    ArrayList<Kendaraan> vehicles;

    public FleetManager() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Kendaraan v) { 
        vehicles.add(v);
    }

    public void displayAllVehicles() {
        for (Kendaraan v : vehicles) { 
            v.displayInfo();
        }
    }

    public double calculateTotalDailyCost(int distance) {
        double total = 0;
        for (Kendaraan v : vehicles) {
            total += v.calculateDailyCost(distance);
        }
        return total;
    }
}