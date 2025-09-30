public class Pegawai {
    protected int gaji;
    
    public Pegawai(int gaji) {
        this.gaji = gaji;
    }
    
    public void deskripsi() {
        System.out.println("Gaji: " + gaji);
    }
    
    public int getGaji() {
        return gaji;
    }
}