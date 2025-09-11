package hp;

public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone hp = new Handphone();

        hp.hidupkan();
        hp.lakukanpanggilan();
        hp.kirimSMS();
        hp.matikan();
    }
}
