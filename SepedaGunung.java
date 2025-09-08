// Mendefinisikan kelas SepedaGunung sebagai turunan dari kelas Sepeda
public class SepedaGunung extends Sepeda {
    // Mendeklarasikan variabel privat 'pedal' dengan tipe data integer
    private int pedal;

    // Method untuk mengatur nilai pedal
    void setPedal(int jumlah){
        // Mengatur nilai pedal dengan mengambil nilai gir dari kelas induk (Sepeda) dikurangi jumlah
        pedal= getGir() - jumlah;
    }

    // Method untuk mendapatkan nilai pedal
    int getPedal(){
        // Mengembalikan nilai dari variabel pedal
        return pedal;
    }
}
