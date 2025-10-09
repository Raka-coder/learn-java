class Mahasiswa{
    String nama;
    int umur;

    void tampilData(){
        System.out.println("nama:" + this.nama);
        System.out.println("umur:" + this.umur);
    }
}

public class Main{
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.nama = "raihan";
        mhs1.umur = 20;
        mhs1.tampilData();
    }
}