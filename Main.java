class Hewan {
    void suara() {
        System.out.println("Suara hewan");
    }
}

class Herbivora extends Hewan {
    void suara() {
        System.out.println("Suara herbivora");
    }
}

class Karnivora extends Hewan {
    void suara() {
        System.out.println("Suara karnivora");
    }
}

public class Main {
    public static void main(String[] args) {

        Hewan h;

        h = new Herbivora();
        h.suara();

        h = new Karnivora();
        h.suara();
    }
}