package Animal;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("First", 5, true);
        Animal a2 = new Animal("Second", 6, false);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1.equals(a2));
    }
}
