package latihan;
/*
 * NPM: 247006111172
 * Nama: Raka Restu Saputra
 * Kelas: F
 * Pertemuan: 6
 */

public class ThreadPemesananKursi extends Thread {
    Konser konser;
    int jumlah;
    boolean useSynchronized; 

    public ThreadPemesananKursi(Konser konser, int jumlah, boolean useSynchronized) {
        this.konser = konser;
        this.jumlah = jumlah;
        this.useSynchronized = useSynchronized;
    }

    @Override
    public void run() {
        if (useSynchronized) {
            konser.pemesananKursiSynchronized(jumlah);
        } else {
            konser.pemesananKursiNonSynchronized(jumlah);
        }
    }
}