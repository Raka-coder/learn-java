/*
 * Nama : Raka Restu Saputra
 * NPM : 247006111172
 * Kelas: F
 */

class Main {
    public static void main(String[] args){
        Restoran r1 = new Restoran("Warung Nasi Padang", "Jl. Jendral Sudirman");
        RestoranCepatSaji r2 = new RestoranCepatSaji("McDonald's", "Jl. Thamrin", 15);

        r1.kirimPesanan("10.00");
        r1.kirimPesanan(2);
        
        r2.terimaPesanan();
        r2.kirimPesanan("11.00");
        r2.kirimPesanan(3);

    }
}