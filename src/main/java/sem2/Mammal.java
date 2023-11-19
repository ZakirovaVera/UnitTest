package sem2;

public class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    public void giveBirth() {
        System.out.println(getName() + " gives birth to live young.");
    }
}

