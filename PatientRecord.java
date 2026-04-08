// PatientRecord Class
class PatientRecord {

    // Fields
    private String patientName;
    private int age;
    private String disease;
    private String doctorName;
    private String roomType;
    private double billAmount;

    // Private Constructor
    private PatientRecord(Builder builder) {
        this.patientName = builder.patientName;
        this.age = builder.age;
        this.disease = builder.disease;
        this.doctorName = builder.doctorName;
        this.roomType = builder.roomType;
        this.billAmount = builder.billAmount;
    }

    // Display Method
    public void displayDetails() {
        System.out.println("\n----- Patient Record -----");
        System.out.println("Name        : " + patientName);
        System.out.println("Age         : " + age);
        System.out.println("Disease     : " + disease);
        System.out.println("Doctor Name : " + doctorName);
        System.out.println("Room Type   : " + roomType);
        System.out.println("Bill Amount : " + billAmount);
    }

    // Static Inner Builder Class
    public static class Builder {

        private String patientName;
        private int age;
        private String disease;
        private String doctorName;
        private String roomType;
        private double billAmount;

        // Setter Methods (Method Chaining)
        public Builder setPatientName(String patientName) {
            this.patientName = patientName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setDisease(String disease) {
            this.disease = disease;
            return this;
        }

        public Builder setDoctorName(String doctorName) {
            this.doctorName = doctorName;
            return this;
        }

        public Builder setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }

        public Builder setBillAmount(double billAmount) {
            this.billAmount = billAmount;
            return this;
        }

        // Build Method
        public PatientRecord build() {
            return new PatientRecord(this);
        }
    }
}


// Main Class
public class Main {
    public static void main(String[] args) {

        // Creating Patient 1
        PatientRecord patient1 = new PatientRecord.Builder()
                .setPatientName("Pooja")
                .setAge(25)
                .setDisease("Fever")
                .setDoctorName("Dr. Kumar")
                .setRoomType("General")
                .setBillAmount(5000.0)
                .build();

        // Creating Patient 2
        PatientRecord patient2 = new PatientRecord.Builder()
                .setPatientName("Arun")
                .setAge(40)
                .setDisease("Diabetes")
                .setDoctorName("Dr. Ravi")
                .setRoomType("Private")
                .setBillAmount(15000.0)
                .build();

        // Display Details
        patient1.displayDetails();
        patient2.displayDetails();
    }
}