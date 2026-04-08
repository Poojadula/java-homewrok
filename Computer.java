
class Computer {
    
    private String processor;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String operatingSystem;

    
    private Computer(Builder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    
    public void showDetails() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Operating System: " + operatingSystem);
        
    }

    
    public static class Builder {
        private String processor;
        private String ram;
        private String storage;
        private String graphicsCard;
        private String operatingSystem;

        // Setter method
        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        // Build method
        public Computer build() {
            return new Computer(this);
        }
    }
}


public class Main {
    public static void main(String[] args) {

        //  Office Computer
        Computer officePC = new Computer.Builder()
                .setProcessor("Intel i3")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .setGraphicsCard("Integrated Graphics")
                .setOperatingSystem("Windows 10")
                .build();

        // Gaming Computer
        Computer gamingPC = new Computer.Builder()
                .setProcessor("Intel i7")
                .setRAM("16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3060")
                .setOperatingSystem("Windows 11")
                .build();

        //  Developer Computer
        Computer developerPC = new Computer.Builder()
                .setProcessor("Intel i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("Integrated Graphics")
                .setOperatingSystem("Linux")
                .build();

        // Display 
        System.out.println("Office Computer:");
        officePC.showDetails();

        System.out.println("Gaming Computer:");
        gamingPC.showDetails();

        System.out.println("Developer Computer:");
        developerPC.showDetails();
    }
}