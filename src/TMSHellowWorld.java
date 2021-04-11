import java.util.Scanner;

public class TMSHellowWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");

        String name = sc.next();

        System.out.println("Hello " + name + ".");
    }
}
