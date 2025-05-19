// Abstract base class
abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String makeSound();
    public abstract String move();
    public abstract String naturalHabitat();
    public void displayInformation() {

        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("Sound: " + makeSound());
        System.out.println("Move: " + move());
        System.out.println("Habitat: " + naturalHabitat());
    }
}

// Mammal class
class Mammal extends Animal {
    private boolean hasFur;

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    @Override
    public String makeSound() {
        return "Roar";
    }

    @Override
    public String move() {
        return "Walks on land";
    }

    @Override
    public String naturalHabitat() {
        return "Savannah or Forest";
    }

    public boolean hasFur() {
        return hasFur;
    }
}

// Bird class
class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public String makeSound() {
        return "Chirp";
    }
    @Override
    public String move() {
        return canFly ? "Flies" : "Walks/Hops";
    }

    @Override
    public String naturalHabitat() {
        return "Forests, Mountains, or Wetlands";
    }

    public boolean canFly() {
        return canFly;
    }
}

// Reptile class
class Reptile extends Animal {
    private boolean isVenomous;

    public Reptile(String name, int age, boolean isVenomous) {
        super(name, age);
        this.isVenomous = isVenomous;
    }

    @Override
    public String makeSound() {
        return "Hiss";
    }

    @Override
    public String move() {
        return "Crawls or slithers";
    }

    @Override
    public String naturalHabitat() {
        return "Swamps or Deserts";
    }

    public boolean isVenomous() {
        return isVenomous;
    }
}

// ZooManagement Main class
public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Mammal("Lion", 5, true);
        Animal penguin = new Bird("Penguin", 3, false);
        Animal snake = new Reptile("Snake", 2, true);
        Animal eagle = new Bird("Eagle", 5, true);

        // Demonstrating polymorphism
        Animal[] zoo = {lion, penguin, snake, eagle};
        for (Animal animal : zoo) {
            animal.displayInformation();
            System.out.println("---");
        }
    }
}
