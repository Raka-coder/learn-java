/*
 * NPM: 247006111172
 * Nama: Raka Restu Saputra
 * Kelas: F
 */

package latihan;

public class PerpustakaanBeraksi {
    public static void main(String[] args) {
        System.out.println("=== Uji Coba Penambahan Buku ===\n");

        System.out.println("Skenario 1: Error (judul kosong / ISBN salah)");
        try {
            Buku buku1 = new Buku();
            buku1.setJudul("");  
            buku1.setIsbn("978ABC..."); 
            System.out.println(buku1);
        } catch (InvalidJudulException | InvalidIsbnException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n" + "-".repeat(50) + "\n");

        // Skenario 2: Valid — judul terisi dan ISBN 13 digit
        System.out.println("Skenario 2: Valid (judul terisi dan ISBN 13 digit)");
        try {
            Buku buku2 = new Buku();
            buku2.setJudul("Belajar Exception di Java");
            buku2.setIsbn("9786020621234");
            System.out.println(buku2);
        } catch (InvalidJudulException | InvalidIsbnException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nProgram selesai.");
    }
}
