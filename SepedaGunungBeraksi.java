// Mendefinisikan kelas untuk menjalankan aksi dari objek SepedaGunung
public class SepedaGunungBeraksi {
    // Metode utama (main) yang akan dieksekusi pertama kali
    public static void main(String[] args) {
        // Membuat objek baru 'sg' dari kelas SepedaGunung
        SepedaGunung sg=new SepedaGunung();
        // Mengatur gir sepeda gunung menjadi 3
        sg.setGir(3);
        // Menampilkan nilai gir yang telah diatur
        System.out.println(sg.getGir());
        // Mengatur nilai pedal sepeda gunung
        sg.setPedal(1);
        // Menampilkan nilai pedal yang telah diatur
        System.out.println(sg.getPedal());
    }
}
