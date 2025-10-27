class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}
public class Q1 {
    public static void main(String[] args) {
        System.out.println("Rupesh Saini\n24CSU259");
        try {
            if (args.length<5) {
                throw new CheckArgumentException("Error:Enter exactly 5 integer arguments.");
            }
            int sum=0;
            for (int i = 0;i<5;i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("The sum of the 5 numbers is: " + sum);
        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers only.");
        }
    }
}