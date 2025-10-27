class MyCustomException extends Exception {
    private String message;  
    public MyCustomException(String message) {
        this.message = message;
    }
    public void displayMessage() {
        System.out.println("Exception Message: " + message);
    }
}
public class Q4 {
    public static void main(String[] args) {
        System.out.println("Rupesh Saini\n24CSU259");
        try {
            throw new MyCustomException("This is my custom exception message!");
        } 
        catch (MyCustomException e) {
            e.displayMessage();
        }
    }
}