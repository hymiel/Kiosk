package Kiosk;

public class Order {
    public static String title = "Welcome to Connects Coffee Espresso Bar";
    public static void stop2Second() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getMessage();
        } //2초 기다렸다가 메뉴로 돌아가기
    }

}