import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the mathematics note: ");
        int math = scanner.nextByte();

        System.out.println("Enter the chemistry  note: ");
        int chem = scanner.nextByte();

        System.out.println("Enter the history note: ");
        int hist = scanner.nextInt();

        int sum = (math + chem + hist)/3;

        boolean passed = sum >= 50;
        String student = passed ? "You passed!" : "You stayed!";

        System.out.println("Student: " + student);
    }
}
