package Kiosk;

import java.util.List;

public class Commodity extends Menu {

    // 메뉴 이름과 설명은 Menu class 에서 상속받아옴
    double price; // 제품의 가격


    public Commodity() {
    }

    public Commodity(String name, String explanation, double price) {
        super(name, explanation);
        this.price = price;
    }

    public void output(List list){
        for (int i = 0; i < list.size(); i++) {
            Commodity menuList2 = (Commodity) list.get(i);
            System.out.println(i+1 + "." + menuList2.name + " | " + menuList2.explanation + " | " + menuList2.price);
        }
    }
    public void outputOrder(List list){
        double totalPrice = 0.0;

        for (int i = 0; i < list.size(); i++) {
            Commodity menuList2 = (Commodity) list.get(i);
            System.out.println(menuList2.name + " | " + menuList2.explanation + " | " + menuList2.price);
            totalPrice += menuList2.price; //가격 합산
        }
        System.out.println("[TOTAL]");
        System.out.println("W " + totalPrice); //유저가 선택한 메뉴의 가격 Total(합산)한 숫자출력

    }
}

