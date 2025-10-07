interface Kendaraan {
    void bergerak();
}

class Mobil implements Kendaraan {
    public void bergerak(){
        System.out.println("Mobil melaju dijalan");
    }
}

class Motor implements Kendaraan {
    public void bergerak(){
        System.out.println("Motor melaju dijalan");
    }
}