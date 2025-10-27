import java.io.File;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rupesh Saini\n24CSU259");
        System.out.print("Enter the file or directory path: ");
        String path = sc.nextLine();
        File f = new File(path);
        if (!f.exists()) {
            System.out.println("The specified path does not exist.");
        } else if (f.isFile()) {
            System.out.println("It is a file.");
        } else if (f.isDirectory()) {
            System.out.println("It is a directory.");
        }
    }
}