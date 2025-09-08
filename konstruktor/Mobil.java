package konstruktor;

public class Mobil {
    String warna;
    int tahunProduksi;

    public Mobil(String warna, int tahunProduksi) {
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    public void info(){
        System.out.println("Warna:" + warna);
        System.out.println("Tahun:" + tahunProduksi);
    }
}
