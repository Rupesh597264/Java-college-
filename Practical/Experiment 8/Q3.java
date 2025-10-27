class LevelOneException extends Exception {
    public LevelOneException(String message) {
        super(message);
    }
}
class LevelTwoException extends LevelOneException {
    public LevelTwoException(String message) {
        super(message);
    }
}
class LevelThreeException extends LevelTwoException {
    public LevelThreeException(String message) {
        super(message);
    }
}
class A {
    void show() throws LevelOneException {
        throw new LevelOneException("Exception thrown from class A (LevelOneException)");
    }
}
class B extends A {
    void show() throws LevelTwoException {
        throw new LevelTwoException("Exception thrown from class B (LevelTwoException)");
    }
}
class C extends B {
    void show() throws LevelThreeException {
        throw new LevelThreeException("Exception thrown from class C (LevelThreeException)");
    }
}
public class Q3 {
    public static void main(String[] args) {
        System.out.println("Rupesh Saini\n24CSU259");
        A obj = new C();
        try {
            obj.show();
        } 
        catch (LevelThreeException e) {
            System.out.println("Caught: " + e.getMessage());
        } 
        catch (LevelTwoException e) {
            System.out.println("Caught: " + e.getMessage());
        } 
        catch (LevelOneException e) {
            System.out.println("Caught: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed. Program ended successfully.");
        }
    }
}
