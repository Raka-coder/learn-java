public class KantinBeraksi {
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Kantin Kampus");
        Kantin kantin = new Kantin(15000);
        kantin.transaksiPembelian(2);
        kantin.infoPendapatan();
    }
}
