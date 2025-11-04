public class Main {
    static void validasiUmur(int umur) throws UmurException {
        if (umur < 18) {
            throw new UmurException("Umur minimal 18 tahun!");
        } 
    }
    public static void main(String[] args) {
        try {
            validasiUmur(15);
            System.out.println("Umur valid!");
        } catch (UmurException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
