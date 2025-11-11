package latihan;
/*
 * NPM: 247006111172
 * Nama: Raka Restu Saputra
 * Kelas: F
 * Pertemuan: 6
 */

public class Konser {
    int kursiTersedia;

    public Konser(int kursiTersedia) {
        this.kursiTersedia = kursiTersedia;
    }

    public synchronized void pemesananKursiSynchronized(int jumlah) {
        if (kursiTersedia >= jumlah) {
            kursiTersedia -= jumlah;
            System.out.println(Thread.currentThread().getName() + " berhasil memesan " + jumlah + " kursi. Sisa kursi: " + kursiTersedia);
        } else {
            System.out.println(Thread.currentThread().getName() + " gagal memesan " + jumlah + " kursi. Kursi tidak mencukupi. Sisa kursi: " + kursiTersedia);
        }
    }

    public void pemesananKursiNonSynchronized(int jumlah) {
        if (kursiTersedia >= jumlah) {
            kursiTersedia -= jumlah;
            System.out.println(Thread.currentThread().getName() + " berhasil memesan " + jumlah + " kursi. Sisa kursi: " + kursiTersedia);
        } else {
            System.out.println(Thread.currentThread().getName() + " gagal memesan " + jumlah + " kursi. Kursi tidak mencukupi. Sisa kursi: " + kursiTersedia);
        }
    }

    public int getKursiTersedia() {
        return kursiTersedia;
    }
}