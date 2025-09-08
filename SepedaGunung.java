// Mendefinisikan kelas SepedaGunung sebagai turunan dari kelas Sepeda
public class SepedaGunung extends Sepeda {
    // Method untuk mengatur nilai pedal
    void setGir(int jumlah){
        super.setGir(jumlah);
        gir=2*jumlah;
    }
}
