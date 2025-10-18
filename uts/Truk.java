/*
 * NPM: 247006111172
 * Nama: Raka Restu Saputra
 * Kelas: F
 */

class Truk extends Kendaraan {
    double loadCapacity;
    double dieselConsumptionPerKm;

    public Truk(String brand, String model, int year, double loadCapacity, double dieselConsumptionPerKm) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
        this.dieselConsumptionPerKm = dieselConsumptionPerKm;
    }

    @Override
    public void start() {
        System.out.println("Truk " + brand + " dinyalakan dengan sistem tekanan udara.");
    }

    @Override
    public void stop() {
        System.out.println("Truk " + brand + " dimatikan.");
    }

    @Override
    public double calculateDailyCost(int distance) {
        return distance * dieselConsumptionPerKm * 18000; 
    }
}