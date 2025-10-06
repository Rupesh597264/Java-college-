class Animal{
    void eat() {
        System.out.println("Animal is eating");
    }
}
interface Pet{
    void play();
}
interface Tr{
    void train();
}
class Dog extends Animal implements Pet, Tr{
    public void play() {
        System.out.println("Dog loves to play");
    }
    public void train() {
        System.out.println("Dog is being trained");
    }
}
class Q1a{
    public static void main(String[] args) {
        System.out.println("Rupesh Saini");
        System.out.println("24CSU259");
        Dog d = new Dog();
        d.eat();
        d.play();
        d.train();
    }
}