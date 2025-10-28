/*
 * NPM: 247006111172
 * Nama: Raka Restu Saputra
 * Kelas: F
 */

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String namaFileOutput = "output.txt";
        String namaFileJadwal = "jadwal_konten.txt";
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Input Data Personal ===");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NPM: ");
        String npm = scanner.nextLine();
        System.out.print("Masukkan Jurusan: ");
        String jurusan = scanner.nextLine();
        System.out.println("\nData berhasil disimpan ke " + namaFileOutput);

        System.out.println("\n=== Input Jadwal Konten ===");
        System.out.print("Tanggal Upload (YYYY-MM-DD): ");
        String tanggal = scanner.nextLine();
        System.out.print("Platform (Instagram/TikTok): ");
        String platform = scanner.nextLine();
        System.out.print("Judul Konten: ");
        String judul = scanner.nextLine();

        ContentSchedule schedule = new ContentSchedule(tanggal, platform, judul);

        try (BufferedWriter jadwalWriter = new BufferedWriter(new FileWriter(namaFileOutput))) {
            jadwalWriter.write(schedule.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter outputWriter = new BufferedWriter(new FileWriter(namaFileJadwal))) {
            outputWriter.write("=== Data Personal ===\n");
            outputWriter.write("Nama: " + nama + "\n");
            outputWriter.write("NPM: " + npm + "\n");
            outputWriter.write("Jurusan: " + jurusan + "\n\n");
            outputWriter.write("=== Jadwal Konten ===\n");
            outputWriter.write(schedule.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nData berhasil disimpan ke " + namaFileJadwal);

        scanner.close();
    }
}