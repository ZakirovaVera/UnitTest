package sem2;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void layEggs() {
        System.out.println(getName() + " lays eggs.");
    }
}

