import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BioDataProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Create FileWriter
            FileWriter fw = new FileWriter("biodata.txt");

            // 👤 Personal Details
            System.out.println("Enter Personal Details");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Date of Birth: ");
            String dob = sc.nextLine();

            System.out.print("Blood Group: ");
            String bloodGroup = sc.nextLine();

            // 🎓 Education
            System.out.println("\nEnter Educational Details");
            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("College Name: ");
            String college = sc.nextLine();

            System.out.print("Percentage / CGPA: ");
            String cgpa = sc.nextLine();

            // 💼 Professional
            System.out.println("\nEnter Professional Details");
            System.out.print("Skills: ");
            String skills = sc.nextLine();

            System.out.print("Experience (in years): ");
            String experience = sc.nextLine();

            // 📞 Contact
            System.out.println("\nEnter Contact Details");
            System.out.print("Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Email ID: ");
            String email = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            // 👨‍👩‍👧 Family
            System.out.println("\nEnter Family Details");
            System.out.print("Father Name: ");
            String father = sc.nextLine();

            System.out.print("Mother Name: ");
            String mother = sc.nextLine();

            // ✍️ Writing to file
            fw.write("=========== BIO DATA ===========\n\n");

            fw.write("👤 Personal Details\n");
            fw.write("Name : " + name + "\n");
            fw.write("Age : " + age + "\n");
            fw.write("Gender : " + gender + "\n");
            fw.write("DOB : " + dob + "\n");
            fw.write("Blood Group : " + bloodGroup + "\n\n");

            fw.write("🎓 Education\n");
            fw.write("Qualification : " + qualification + "\n");
            fw.write("College : " + college + "\n");
            fw.write("CGPA : " + cgpa + "\n\n");

            fw.write("💼 Skills\n");
            fw.write(skills + "\n\n");
            fw.write("Experience : " + experience + " Year(s)\n\n");

            fw.write("📞 Contact\n");
            fw.write("Phone : " + phone + "\n");
            fw.write("Email : " + email + "\n");
            fw.write("Address : " + address + "\n\n");

            fw.write("👨‍👩‍👧 Family\n");
            fw.write("Father Name : " + father + "\n");
            fw.write("Mother Name : " + mother + "\n");

            fw.write("\n================================\n");

            // Close file
            fw.close();

            System.out.println("\n✅ Bio Data saved successfully in biodata.txt");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        sc.close();
    }
}