public class Pegawai {
    int gaji;

    Pegawai(int gaji) {
        this.gaji = gaji;
    }

    void deskripsi() {
        System.out.println("Gaji : " + gaji);
    }
}

class Dosen extends Pegawai {
    String mataKuliah;

    Dosen(int gaji, String mataKuliah) {
        super(gaji);
        this.mataKuliah = mataKuliah;
    }

    void deskripsi() {
        System.out.println("==== Data Dosen ====");
        super.deskripsi();
        System.out.println("Mata Kuliah:" + mataKuliah);

    }
}

class Staff extends Pegawai {
    String bagian;

    Staff(int gaji, String bagian) {
        super(gaji);
        this.bagian = bagian;

    }

    void deskripsi() {
        System.out.println("==== Data Staff ====");
        super.deskripsi();
        System.out.println("Bagian:" + bagian);
    }

}