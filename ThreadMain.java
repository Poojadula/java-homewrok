public class ThreadMain {
    public static void main(String[] args) {

        try {
            System.out.println("DIWAKAR");
            Thread.sleep(2000);

            System.out.println("KARTHIK");
            Thread.sleep(2000);

            System.out.println("RAJESH");
            Thread.sleep(2000);

            System.out.println("SATHISH");
            Thread.sleep(2000);

            System.out.println("SURYA");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}