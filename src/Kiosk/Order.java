package Kiosk;

public class Order {
    public static String title = "Welcome to Connects Coffee Espresso Bar";
    public static void stop2Second() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

}