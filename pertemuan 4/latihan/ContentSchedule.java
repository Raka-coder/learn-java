/*
 * NPM: 247006111172
 * Nama: Raka Restu Saputra
 * Kelas: F
 */
package latihan;

public class ContentSchedule {
    private String tanggal;
    private String platform;
    private String judul;

    public ContentSchedule(String tanggal, String platform, String judul) {
        this.tanggal = tanggal;
        this.platform = platform;
        this.judul = judul;
    }
    
    public String getTanggal() {
        return tanggal;
    }

    public String getPlatform() {
        return platform;
    }

    public String getJudul() {
        return judul;
    }

    @Override
    public String toString() {
        return "Tanggal Upload (YYYY-MM-DD): " + tanggal + "\n" + "Platform (Instagram/TikTok): " + platform + "\n" + "Judul Konten: " + judul;
    }
}