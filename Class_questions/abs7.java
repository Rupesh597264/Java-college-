class Grandfather {
    void show() {
        System.out.println("This is Grandfather");
    }
}
class Father extends Grandfather {
    void display() {
        System.out.println("This is Father");
    }
}
class Son extends Father {
    void print() {
        System.out.println("This is Son");
    }
}
public class abs7 {
    public static void main(String[] args) {
        Son s = new Son();
        s.show();   
        s.display(); 
        s.print();   
}
}