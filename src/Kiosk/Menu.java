package Kiosk;

public class Menu {
    String name; // 메뉴 이름
    String explanation; // 메뉴 설명

    public Menu() {
        //기본 생성자
    }
    public static String title = "Welcome to Connects Coffee Espresso Bar";
    public Menu(String name, String explanation) {
        this.name = name;
        this.explanation = explanation;
    }

    public void menuArr(Menu[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 +"." + arr[i].name + "|" + arr[i].explanation);
        }
    }


}