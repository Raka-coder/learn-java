/*
 * NPM: 247006111172
 * Nama: Raka Restu Saputra
 * Kelas: F
 */

public class Main  {
    public static void main(String[] args) {
        FleetManager manager = new FleetManager();

        System.out.println();
        System.out.println("Sistem Manajemen Kendaraan Pintar (Smart Vehicle Management System)");
        System.out.println();
 
        Mobil mobil = new Mobil("Mercedes-Benz", "S 450 Sedan", 2018, 80, 0.11);
        Truk truk = new Truk("Isuzu", "Forward", 2019, 10.0, 0.3);

        manager.addVehicle(mobil);
        manager.addVehicle(truk);

        for (Kendaraan v : manager.vehicles) {
            v.start();
            v.displayInfo();
            System.out.printf("Biaya operasional harian (100 km): Rp%,.0f%n", v.calculateDailyCost(100));
            v.stop();
            System.out.println("---");
        }

        System.out.printf("Total biaya operasional harian semua kendaraan: Rp%,.0f%n", manager.calculateTotalDailyCost(100));
    }
}