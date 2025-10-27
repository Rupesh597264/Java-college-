abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog says: Woof Woof");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat says: Meow Meow");
    }
}
class Cow extends Animal {
    void makeSound() {
        System.out.println("Cow says: Moo Moo");
    }
}
public class abs3 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}