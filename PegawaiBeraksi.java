public class PegawaiBeraksi {
    public static void main(String[] args) {
        Dosen dosen = new Dosen(5000000, "PBO");

        Staff staff = new Staff(3000000, "Administrasi");

        dosen.deskripsi();
        System.out.println();
        staff.deskripsi();
    }
}
