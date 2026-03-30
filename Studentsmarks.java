import java.util.Scanner;

class Studentsmarks {

    String studentName;

    // Inner Class
    class Subject {
        String subjectName;
        int mark;

        Subject(String subjectName, int mark) {
            this.subjectName = subjectName;
            this.mark = mark;
        }
    }

    void calculateMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Subject[] subjects = new Subject[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Subject Name: ");
            String subName = sc.nextLine();

            System.out.print("Enter Mark: ");
            int mark = sc.nextInt();
            sc.nextLine(); // consume newline

            subjects[i] = new Subject(subName, mark);
            total += mark;
        }

        double average = (double) total / n;

        // Output
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + studentName);

        for (Subject s : subjects) {
            System.out.println(s.subjectName + " : " + s.mark);
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.calculateMarks();
    }
}