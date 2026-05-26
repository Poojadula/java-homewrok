import java.sql.*;
import java.util.Scanner;

public class StudentRecord {

    // Database URL, Username, Password
    static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "postgres";
    static final String PASS = "your_password";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Load Driver
            Class.forName("org.postgresql.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            int choice;

            do {
                System.out.println("\n===== STUDENT RECORD MENU =====");
                System.out.println("1. Insert");
                System.out.println("2. Display");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch(choice) {

                    // INSERT
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        int marks = sc.nextInt();

                        String insertQuery =
                                "INSERT INTO student VALUES (?, ?, ?)";

                        PreparedStatement pst1 =
                                con.prepareStatement(insertQuery);

                        pst1.setInt(1, id);
                        pst1.setString(2, name);
                        pst1.setInt(3, marks);

                        int rows1 = pst1.executeUpdate();

                        if(rows1 > 0)
                            System.out.println("Record Inserted Successfully");

                        break;

                    // DISPLAY
                    case 2:

                        String displayQuery =
                                "SELECT * FROM student";

                        PreparedStatement pst2 =
                                con.prepareStatement(displayQuery);

                        ResultSet rs = pst2.executeQuery();

                        System.out.println("\nID\tNAME\tMARKS");

                        while(rs.next()) {

                            System.out.println(
                                    rs.getInt("id") + "\t" +
                                    rs.getString("name") + "\t" +
                                    rs.getInt("marks")
                            );
                        }

                        break;

                    // UPDATE
                    case 3:

                        System.out.print("Enter Student ID to Update: ");
                        int uid = sc.nextInt();

                        System.out.print("Enter New Marks: ");
                        int newMarks = sc.nextInt();

                        String updateQuery =
                                "UPDATE student SET marks=? WHERE id=?";

                        PreparedStatement pst3 =
                                con.prepareStatement(updateQuery);

                        pst3.setInt(1, newMarks);
                        pst3.setInt(2, uid);

                        int rows3 = pst3.executeUpdate();

                        if(rows3 > 0)
                            System.out.println("Record Updated Successfully");
                        else
                            System.out.println("Record Not Found");

                        break;

                    // DELETE
                    case 4:

                        System.out.print("Enter Student ID to Delete: ");
                        int did = sc.nextInt();

                        String deleteQuery =
                                "DELETE FROM student WHERE id=?";

                        PreparedStatement pst4 =
                                con.prepareStatement(deleteQuery);

                        pst4.setInt(1, did);

                        int rows4 = pst4.executeUpdate();

                        if(rows4 > 0)
                            System.out.println("Record Deleted Successfully");
                        else
                            System.out.println("Record Not Found");

                        break;

                    // EXIT
                    case 5:
                        System.out.println("Program Exited");
                        break;

                    default:
                        System.out.println("Invalid Choice");

                }

            } while(choice != 5);

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}