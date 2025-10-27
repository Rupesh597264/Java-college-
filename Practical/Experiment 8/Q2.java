public class Q2 {
    public static void main(String[] args) {
        System.out.println("Rupesh Saini\n24CSU259");
        try {
            throw new Exception("This is a custom exception message.");
        } 
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed. Program ended safely.");
        }
    }
}