/*
 * Nama: Raka Restu Saputra
 * NPM : 247006111172
 * Kelas: F
 * Praktikum PBO
 */

public class Kantin {
    int hargaMakanan;
    int totalPendapatan;

    public Kantin(int hargaMakanan){
        this.hargaMakanan = hargaMakanan;
        this.totalPendapatan = 0;
    }


    public void transaksiPembelian(int jumlah){
        int totalHarga = this.hargaMakanan * jumlah;
        this.totalPendapatan += totalHarga;
        System.out.println("Mahasiswa membeli " + jumlah + " porsi: Rp" + totalHarga);
    }

    public void infoPendapatan(){
        System.out.println("Total Pendapatan: Rp" + this.totalPendapatan);
    }
}
