public class Thread {
    public static void main(String[] args) {

        try {
            printWithDelay("HAI");
            System.out.println();

            printWithDelay("HAI SIR HOW CAN I HELP YOU");
            System.out.println();

            printWithDelay("CAN YOU TELL ME ABOUT JAVA");
            System.out.println();

            printWithDelay("SURE, JAVA IS AN PROGRAMMING");
            System.out.println();

            printWithDelay("LANGUAGE WHICH IS USED FOR DEVELOP");
            System.out.println();

            printWithDelay("APPLICATIONS WITH PLATFORM");
            System.out.println();

            printWithDelay("INDEPENDENT");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void printWithDelay(String text) throws InterruptedException {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            Thread.sleep(300L); // 0.3 seconds = 300 ms
        }
    }
}