package Kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Formatter;
import java.io.PrintStream;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        while (true) {
            System.out.println(Menu.title);
            System.out.println(" ========= [CONNECTS MENU] ========= ");
            System.out.println("아래 상품 메뉴판을 보시고, 상품을 골라 입력해주세요.");
            System.out.println();
            System.out.println("1. ESPRESSO   | 에스프레소");
            System.out.println("2. NON COFFEE | 카페인이 없는 주스&티");
            System.out.println("3. DESSERT    | 다양한 디저트");
            System.out.println();
            System.out.println("4. Order      | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel     | 진행중인 주문을 취소합니다.");
            int order = scanner.nextInt();
            scanner.nextLine();

            switch (order) {
                case 1:
                    System.out.println("[ CAFE MENU ]");
                    System.out.println("1. Cafe Espresso   | 2900원 | 에스프레소, 설탕(설탕이 필요 없는 경우 미리 말씀해주세요.)");
                    System.out.println("2. Cafe Strapazzato    | 3300원 | 에스프레소, 설탕, 카카오");
                    System.out.println("3. Cafe Gege | 3800원 | 에스프레소,카카오, 크림");
                    System.out.println("4. Cafe Romano     | 4300원 | 에스프레소, 설탕, 레몬");
                    break;
                case 2:
                    System.out.println("[ NON COFFEE MENU ]");
                    System.out.println("1. Orange Juice   | 5000원 | 100% 오렌지 주스");
                    System.out.println("2. Chocolat Latte    | 5000원 | 40% 카카오 함량의 초콜릿과 우유");
                    System.out.println("3. Black & Herb Tea | 5000원 | 잉글리쉬 블랙퍼스트, 모로칸 미트, 애플앤블랙베리");
                    System.out.println("4. Yuzu Green Tea     | 5500원 | 유자차와 그린티");
                    System.out.println("5. Cherry Lemonade     | 5500원 | 파브리 체리, 레몬, 탄산수");
                    break;
                case 3:
                    System.out.println("[ DESSERT MENU ]");
                    System.out.println("1. Salted Butter Bread   | 3500원 | 좋은 질감과 풍미가 가득한 빵");
                    System.out.println("2. Twist Stick    | 2300원 | 40% 페스츄리 질감의 달콤한 꽈배기 빵");
                    break;
                default:
                    System.out.println("유효하지 않은 선택입니다. 다시 선택해주세요.");
                    continue;
            }
            if (order == 5) {
                System.out.println("\n1. 주문      2. 메뉴판");
                System.out.print("선택하세요: ");
                int orderChoice = scanner.nextInt();
                scanner.nextLine();
                if (orderChoice == 1) {
                    System.out.println("주문이 완료되었습니다.");
                    break;
                } else if (orderChoice == 2) {
                    continue;
                } else {
                    System.out.println("유효하지 않은 선택입니다. 처음으로 돌아갑니다.");
                    continue;
                }
            } else if (order == 6) {
                System.out.println("진행중인 주문이 취소되었습니다.");
                break;
            }



        }
    }
}
