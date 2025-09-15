public class LampuBeraksi {
    public static void main(String[] args) {
        Lampu lampukamar = new Lampu();

        System.out.println("Status Lampu Saat Ini: Mati");
        lampukamar.hidupkan();
        lampukamar.matikan();
        lampukamar.matikan();
        lampukamar.hidupkan();
        lampukamar.hidupkan();
    }
}