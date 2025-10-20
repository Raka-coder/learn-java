class Main {
    public static void main(String[] args) {
        Hewan h1 = new Kucing(); // Class Kucing
        Hewan h2 = new Anjing(); // Class Anjing

        h1.suara();
        h2.suara();
    }
}

// Base abstract class representing an animal
abstract class Hewan {
    abstract void suara();
}

// Kucing (cat) implementation
class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong");
    }
}

// Anjing (dog) implementation
class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk guk");
    }
}
