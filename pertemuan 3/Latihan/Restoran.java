/*
 * Nama : Raka Restu Saputra
 * NPM : 247006111172
 * Kelas: F
 */

class Restoran{
    String nama;
    String lokasi;

    public Restoran(String nama, String lokasi) {
        this.nama = nama;
        this.lokasi = lokasi;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Restoran: " + nama);
        System.out.println("Lokasi Restoran: " + lokasi);
    }

    // Provide basic kirimPesanan overloads so code using Restoran references compiles
    public void kirimPesanan(String waktu){
        System.out.println("Pesanan dari " + nama + " dikirim pada waktu " + waktu + ".");
    }

    public void kirimPesanan(int jumlahPesanan){
        System.out.println("Mengirim " + jumlahPesanan + " pesanan dari Restoran " + nama + ".");
    }
}

class RestoranCepatSaji extends Restoran {
    int waktuLayanan;
    
    public RestoranCepatSaji(String nama, String lokasi, int waktuLayanan) {
        super(nama, lokasi);
        this.waktuLayanan = waktuLayanan;
    }
    public void terimaPesanan(){
        System.out.println("Restoran Cepat Saji " + nama + " menerima pesanan, waktu siap " + waktuLayanan + " menit.");
    }

    public void kirimPesanan(String waktu){
        System.out.println("Pesanan dari " + nama + " dikirim pada waktu " + waktu + ".");
    }
    public void kirimPesanan(int jumlahPesanan){
        System.out.println("Mengirim " + jumlahPesanan + " pesanan dari " + nama + ".");
    }
}