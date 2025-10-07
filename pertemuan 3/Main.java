
class Main {
    public static void main(String[] args) {
        Kalkulator k1 = new Kalkulator();
        int hasil1 = k1.tambah(100, 200);
        System.out.println(hasil1);

        // k1.tambah(0.5, 1.5);
        // k1.tambah(100, 200, 300);
        System.out.println(k1.tambah(0.5, 1.5));
        System.out.println(k1.tambah(100, 200, 300));
    }
}
