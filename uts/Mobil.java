/*
 * NPM: 247006111172
 * Nama: Raka Restu Saputra
 * Kelas: F
 */

class Mobil extends Kendaraan {
    int fuelCapacity;
    double fuelConsumptionPerKm;

    public Mobil(String brand, String model, int year, int fuelCapacity, double fuelConsumptionPerKm) {
        super(brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    @Override
    public void start() {
        System.out.println("Mobil " + brand + " dinyalakan menggunakan tombol start.");
    }

    @Override
    public void stop() {
        System.out.println("Mobil " + brand + " dimatikan.");
    }

    @Override
    public double calculateDailyCost(int distance) {
        return distance * fuelConsumptionPerKm * 15000; 
    }
}