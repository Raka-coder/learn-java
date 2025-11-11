package latihan;
/*
 * NPM: 247006111172
 * Nama: Raka Restu Saputra
 * Kelas: F
 * Pertemuan: 6
 */

public class SimulasiKonser {
    public static void main(String[] args) {
        Konser konser = new Konser(10);

        System.out.println("=== OUTPUT KETIKA SYNCHRONIZED ===");

        ThreadPemesananKursi t1Sync = new ThreadPemesananKursi(konser, 5, true);
        ThreadPemesananKursi t2Sync = new ThreadPemesananKursi(konser, 3, true);
        ThreadPemesananKursi t3Sync = new ThreadPemesananKursi(konser, 4, true); 

        t1Sync.setName("Pembeli-1");
        t2Sync.setName("Pembeli-2");
        t3Sync.setName("Pembeli-3");

        t1Sync.start();
        t2Sync.start();
        t3Sync.start();

        try {
            t1Sync.join();
            t2Sync.join();
            t3Sync.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        konser = new Konser(10);

        System.out.println("\n=== OUTPUT TANPA SYNCHRONIZED ===");
        
        ThreadPemesananKursi t1NoSync = new ThreadPemesananKursi(konser, 5, false);
        ThreadPemesananKursi t2NoSync = new ThreadPemesananKursi(konser, 3, false);
        ThreadPemesananKursi t3NoSync = new ThreadPemesananKursi(konser, 4, false);

        t1NoSync.setName("Pembeli-1");
        t2NoSync.setName("Pembeli-2");
        t3NoSync.setName("Pembeli-3");

        t1NoSync.start();
        t2NoSync.start();
        t3NoSync.start();

        try {
            t1NoSync.join();
            t2NoSync.join();
            t3NoSync.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}