package model;

public class Mahasiswa {
    private String nama;
    private String npm;

    public Mahasiswa(String nama, String npm){
        this.nama = nama;
        this.npm = npm;
    }

    public void tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
    }
}