package Animal;

import java.util.Objects;

public class Animal {
   private String name;
   private int age;
   private Boolean tail;

    public Animal(String name, int age, Boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }
    public String toString(){
        return "Name "+ name + "\n" + "Age " + age + "\n" + "Tail " + tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                name.equals(animal.name) &&
                tail.equals(animal.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
