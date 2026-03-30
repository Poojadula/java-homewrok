class Student1 {
    String name;
    int rollNo;

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Inner class
    class Marks {
        int sub1, sub2, sub3;

        // Constructor
        Marks(int sub1, int sub2, int sub3) {
            this.sub1 = sub1;
            this.sub2 = sub2;
            this.sub3 = sub3;
        }

        // Method to display total and average
        void display() {
            int total = sub1 + sub2 + sub3;
            double average = total / 3.0;

            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNo);
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create outer class object
        Student s = new Student("Pooja", 101);

        // Create inner class object
        Student.Marks m = s.new Marks(85, 90, 88);

        // Display result
        m.display();
    }
}