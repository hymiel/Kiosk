package Kiosk;

import java.util.List;

public class Commodity extends Menu {
    // 커피의 종류, 종류별로 설명, 종류별로 가격
    // 메뉴 이름과 설명은 Menu class 에서 상속받아옴
    double price; // 제품의 가격


    public Commodity() {
    } //기본 생성자

    public Commodity(String name, String explanation, double price) {
        super(name, explanation); // 상속받아 온 조상의 생성자를 호출할 때 사용
        this.price = price;
    } //매개변수가 있는 생성자

    public void output(List list){
        for (int i = 0; i < list.size(); i++) {
            Commodity menuList2 = (Commodity) list.get(i);
            System.out.println(i+1 + "." + menuList2.name + " | " + menuList2.explanation + " | " + menuList2.price);
        } // 메뉴 리스트를 출력
    } //메뉴 리스트를 위한 메서드
    public void outputOrder(List list){ // Order 선택 시 오더
        double totalPrice = 0.0; // 가격 값을 초기화

        for (int i = 0; i < list.size(); i++) {
            Commodity menuList2 = (Commodity) list.get(i);
            System.out.println(menuList2.name + " | " + menuList2.explanation + " | " + menuList2.price);
            totalPrice += menuList2.price; //가격 합산
        }
        System.out.println("[TOTAL]");
        System.out.println("W " + totalPrice); //유저가 선택한 메뉴의 가격 Total(합산)한 숫자출력

    } // 주문내역 합산 메서드
}

