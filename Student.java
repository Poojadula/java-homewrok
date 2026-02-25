import java.util.Scanner;

class Student {
    int[] marks = new int[5];
    int total = 0;

    void inputMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
    }

    int calculateTotal() {
        return total;
    }

    double calculatePercentage() {
        return total / marks.length;
    }

    void displayResult() 
	{
		boolean check = true;
        for(int i = 0;i<marks.length;i++)
		{
			if (marks[i]<40){
				check = false;
			}
			
		}
		if(check == true)
		{
				System.out.println("Result: Pass");
			
		}
		else{
				System.out.println("Result: Fail");
		}
    }

    void displayGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 75)
            System.out.println("Grade: A");
        else if (percentage >= 60)
            System.out.println("Grade: B");
        else if (percentage >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        int choice;

        s.inputMarks();

        do {
            System.out.println("Menu");
            System.out.println("1. Display Total");
            System.out.println("2. Display Percentage");
            System.out.println("3. Display Result");
            System.out.println("4. Display Grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Total Marks: " + s.calculateTotal());
                    break;
                case 2:
                    System.out.println("Percentage: " + s.calculatePercentage() + "%");
                    break;
                case 3:
                    s.displayResult();
                    break;
                case 4:
                    s.displayGrade();
                    break;
                case 5:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}