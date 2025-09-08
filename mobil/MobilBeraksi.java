package mobil;


public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2006;
        System.out.println("Warna:" + mobilku.warna);
        System.out.println("Tahun:" + mobilku.tahunProduksi);
    }
}
