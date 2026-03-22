import java.util.Scanner;

public class CodeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        // Convert to uppercase and extract first 3 letters
        String namePart = name.substring(0, 3).toUpperCase();
        String deptPart = dept.substring(0, 3).toUpperCase();

        // Using StringBuilder
        StringBuilder code = new StringBuilder();
        code.append(namePart)
            .append("-")
            .append(deptPart)
            .append("-")
            .append(year);

        // Output
        System.out.println("Generated Code: " + code);

        sc.close();
    }
}