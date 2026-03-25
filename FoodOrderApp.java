class OrderTask implements Runnable {
    private String taskName;

    public OrderTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + ": " + taskName);
            Thread.sleep(2000); // 2 seconds delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	public class FoodOrderApp {
    public static void main(String[] args) {
        
        // Create tasks
        OrderTask preparation = new OrderTask("Order is being prepared");
        OrderTask packing = new OrderTask("Order is being packed");
        OrderTask delivery = new OrderTask("Order is out for delivery");

        // Create threads
        Thread t1 = new Thread(preparation, "OrderPreparation Thread");
        Thread t2 = new Thread(packing, "Packing Thread");
        Thread t3 = new Thread(delivery, "Delivery Thread");

        // Start threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final message
        System.out.println("\nOrder process completed");
    }
}
}

