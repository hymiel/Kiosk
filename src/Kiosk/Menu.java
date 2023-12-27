package Kiosk;

import java.util.List;

public class Menu {
    // 커피, 주스, 디저트 큰 카테고리
    private String name; //메뉴 이름
    private String explanation; // 메뉴 설명
    private int place;

    public Menu() {

    }

    public String getName() {
        return name;
    }

    public String getExplanation() {
        return explanation;
    }

    public int getPlace() {
        return place;
    }

    public Menu(String name, String explanation, int place) {
        this.name = name;
        this.explanation = explanation;
        this.place = place;
    }


    public void output(List list){
        for (int i = 0; i < list.size(); i++) {
            Menu menuList = (Menu) list.get(i);
            System.out.println(i+1 + "." + menuList.name + " | " + menuList.explanation + " | " + menuList.place);
        } // 메뉴 리스트를 출력
    } //메뉴 리스트를 위한 메서드

    public void outputOrder(List list){ // Order 선택 시 오더
        double totalPrice = 0.0; // 가격 값을 초기화

        for (int i = 0; i < list.size(); i++) {
            Menu menuList = (Menu) list.get(i);
            System.out.println(i+1 + "." + menuList.name + " | " + menuList.explanation + " | " + menuList.place);
            totalPrice += menuList.place; //가격 합산
        }
        System.out.println("[TOTAL]");
        System.out.println("W " + totalPrice); //유저가 선택한 메뉴의 가격 Total(합산)한 숫자출력

    } // 주문내역 합산 메서드


}



