
class Dosen extends Pegawai {
    private String mataKuliah;
    
    public Dosen(int gaji, String mataKuliah) {
        super(gaji);
        this.mataKuliah = mataKuliah;
    }
    
   
    public void deskripsi() {
        System.out.println("==== Data Dosen ====");
        System.out.println("Gaji: " + gaji);
        System.out.println("Mata Kuliah: " + mataKuliah);
    }
}


class Staf extends Pegawai {
    private String bagian;
    
    public Staf(int gaji, String bagian) {
        super(gaji);
        this.bagian = bagian;
    }
    
  
    public void deskripsi() {
        System.out.println("==== Data Staf ====");
        System.out.println("Gaji: " + gaji);
        System.out.println("Bagian: " + bagian);
    }
}


public class PegawaiBeraksi {
    public static void main(String[] args) {
        
        Dosen dosen = new Dosen(5000000, "PBO");
        dosen.deskripsi();
        
        System.out.println(); 
        
        
        Staf staf = new Staf(3000000, "Administrasi");
        staf.deskripsi();
    }
}