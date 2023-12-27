package Kiosk;

import java.util.List;

public class Order {
    public static String title = "Welcome to Connects Coffee Espresso Bar";
    public static void stop2Second() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getMessage();
        } //2초 기다렸다가 메뉴로 돌아가기
    }
    private static int orderNumberCounter = 1; // 주문 대기번호 카운터
    static int generateOrderNumber() {

        return orderNumberCounter++; // 대기번호 증가 및 반환
    }

}