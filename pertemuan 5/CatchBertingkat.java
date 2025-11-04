import java.util.Scanner;

public class CatchBertingkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = { 10, 20, 30 };

        try {
            System.out.print("Masukkan Sebuah Angka: ");
            int inputAngka = scanner.nextInt();

            int hasilBagi = 100 / inputAngka;
            System.out.println("Hasil Bagi 100 / " + inputAngka + " = " + hasilBagi);

            int dataArray = array[inputAngka];
            System.out.println("Data di index " + inputAngka + " = " + dataArray);

        } catch (ArithmeticException e) {
            System.out.println("ERROR: Tidak boleh dibagi dengan angka nol!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nERROR: Index tidak ditemukan!");
        } finally {
            scanner.close();
            System.out.println("Kode ini selalu dijalankan!");
        }
    }

}
