public class ExampleException {
    public static void main(String[] args) {
        int[] angka = { 1, 2, 3 };

        try {
            System.out.println(angka[10]);

        } catch (Exception e) {
            System.err.println("Terjadi kesalahan!");
        }
        System.out.println("Program selesai");
    }
}