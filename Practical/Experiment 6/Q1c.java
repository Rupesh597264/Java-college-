interface A {
    void showa();
}
interface B {
    void showb();
}
interface C extends A, B {
    void showc();
}
class Test implements C {
    public void showa() {
        System.out.println("From interface A");
    }
    public void showb() {
        System.out.println("From interface B");
    }
    public void showc() {
        System.out.println("From interface C");
    }
}
class Q1c {
    public static void main(String[] args) {
        System.out.println("Rupesh Saini");
        System.out.println("24CSU259");
        Test o = new Test();
        o.showa();
        o.showb();
        o.showc();
    }
}