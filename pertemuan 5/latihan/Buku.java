/*
 * NPM: 247006111172
 * Nama: Raka Restu Saputra
 * Kelas: F
 */

package latihan;

public class Buku {
    private String judulBuku;
    private String isbnBuku;


    public String getJudul() {
        return judulBuku;
    }

    public String getIsbn() {
        return isbnBuku;
    }

    public void setJudul(String judulBuku) throws InvalidJudulException {
        if (judulBuku == null || judulBuku.trim().isEmpty()) {
            throw new InvalidJudulException("ERROR: Judul kosong");
        }
        this.judulBuku = judulBuku.trim();
    }

    public void setIsbn(String isbnBuku) throws InvalidIsbnException {
        if (isbnBuku == null || !isbnBuku.matches("\\d{13}")) {
            throw new InvalidIsbnException("ERROR: ISBN bukan angka 13 digit");
        }
        this.isbnBuku = isbnBuku;
    }

    @Override
    public String toString() {
        return "Judul: " + judulBuku + ", ISBN: " + isbnBuku;
    }

}
