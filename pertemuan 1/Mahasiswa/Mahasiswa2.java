public class Mahasiswa2 {
    String nama;
    int umur;

    Mahasiswa2(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    void tampilData(){
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
    }

    public static void main(String[] args) {
        Mahasiswa2 mhs = new Mahasiswa2("Rakha", 21);
        mhs.tampilData();
    }
}
