interface BukuBagus {
    double RATING = 4.5;

    void cover();
    void judul();
    void bab();
    void infoBuku();
}

public class HarryPotter implements BukuBagus {
    @Override
    public void cover(){
        System.out.println("Ini cover");
    }

    @Override
    public void judul(){
        System.out.println("Ini judul");
    }

    @Override
    public void bab(){
        System.out.println("Ini bab");
    }

    @Override
    public void infoBuku(){
        System.out.println("===== INFORMASI BUKU =====");
        this.cover();
        this.judul();
        this.bab();
        System.out.println("RATING: " + BukuBagus.RATING);
    }
    
}
