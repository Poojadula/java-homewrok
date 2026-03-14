class StudentMarks{

    // Method with 2 subject marks
    void marks(int m1, int m2) {
        int total = m1 + m2;
        System.out.println("Total (2 subjects) : " + total);
    }

    // Method with 3 subject marks
    void marks(int m1, int m2, int m3) {
        int total = m1 + m2 + m3;
        System.out.println("Total (3 subjects) : " + total);
    }

    // Method with 4 subject marks
    void marks(int m1, int m2, int m3, int m4) {
        int total = m1 + m2 + m3 + m4;
        System.out.println("Total (4 subjects) : " + total);
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.marks(80, 90);           // 2 subjects
        s.marks(80, 85, 80);       // 3 subjects
        s.marks(70, 80, 75, 75);   // 4 subjects
    }
}