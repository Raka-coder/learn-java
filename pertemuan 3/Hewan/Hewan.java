class Hewan {
    void suara(){
        System.out.println("Hewan Bersuara...");
    }
}

class Kucing extends Hewan {
    @Override
    void suara(){
        System.out.println("Meaw!");
    }
}

class Anjing extends Hewan {
    @Override
    void suara(){
        System.out.println("Guk guk...");
    }
}
