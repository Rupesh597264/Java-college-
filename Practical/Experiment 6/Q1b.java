interface Animal{
    void eat();
}
interface Pet extends Animal{
    void play();
}
class Dog implements Pet{
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void play() {
        System.out.println("Dog is playing");
    }
}
class Q1b{
    public static void main(String[] args) {
        System.out.println("Rupesh Saini");
        System.out.println("24CSU259");
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}