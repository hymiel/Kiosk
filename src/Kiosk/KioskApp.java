package Kiosk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class KioskApp{

    public static void main(String[] args) {
        // 메인 카테고리 메뉴 HashMap 이용
        HashMap<Integer, String> menuList = new HashMap<Integer, String>();
        menuList.put(1, "1. ESPRESSO   | 에스프레소");
        menuList.put(2, "2. NON COFFEE | 카페인이 없는 주스&티");
        menuList.put(3, "3. DESSERT    | 다양한 디저트");
        menuList.put(4, "4. OREDER     | 장바구니 확인 후 주문합니다.");
        menuList.put(5, "5. CANCEL     | 진행중인 주문을 취소합니다.");


      //  배열 생성
        List espresso = new ArrayList();

      // 배열에 객체 입력(배열 안에 객체를 넣는다.)
        espresso.add(new Menu("Cafe Espresso" ,"에스프레소, 설탕(설탕이 필요 없는 경우 미리 말씀해주세요.)", 2900)); //0
        espresso.add(new Menu("Cafe Strapazzato","에스프레소, 설탕, 카카오", 3300)); //1
        espresso.add(new Menu("Cafe Gege","에스프레소,카카오, 크림", 3800)); //2
        espresso.add(new Menu("Cafe Romano","에스프레소, 설탕, 레몬",4300)); //3

        List nonCoffee = new ArrayList();

        nonCoffee.add(new Menu("Orange Juice","100% 오렌지 주스",5000));
        nonCoffee.add(new Menu("Chocolat Latte","40% 카카오 함량의 초콜릿과 우유",5000));
        nonCoffee.add(new Menu("Black & Herb Tea","잉글리쉬 블랙퍼스트, 모로칸 미트, 애플앤블랙베리",5000));
        nonCoffee.add(new Menu("Yuzu Green Tea","유자차와 그린티",5500));
        nonCoffee.add(new Menu("Cherry Lemonade","파브리 체리, 레몬, 탄산수",5500));

        List dessert = new ArrayList();

        dessert.add(new Menu("Salted Butter Bread","좋은 질감과 풍미가 가득한 빵",3500));
        dessert.add(new Menu("Twist Stick","40% 페스츄리 질감의 달콤한 꽈배기 빵",2300));


        List orderList = new ArrayList(); //주문 리스트를 받기 위한 오더 리스트 생성

        System.out.println(Order.title);
        Menu commodity = new Menu();


        while (true) { //메인 메뉴판 : 1번화면
            System.out.println(" ========= [CONNECTS MENU] ========= ");
            System.out.println("아래 상품 메뉴판을 보시고, 상품을 골라 입력해주세요.");
            System.out.println();
            for (int i = 1; i <= menuList.size(); i++) {
                System.out.println(menuList.get(i));
            }
            Scanner input = new Scanner(System.in); // 입력 값

            System.out.println("선택 : ");
            int order = input.nextInt(); // 유저가 선택한 번호를 변수 int order에 저장

            switch (order) {
                case 1 :
                    commodity.output(espresso); //에스프레소 종류가 commodity 메서드 출력
                    //에스프레소 선택 시
                    Scanner scanner1 = new Scanner(System.in); // 메뉴선택 스캐너
                    int espressoNumber = scanner1.nextInt() ; // 유저가 입력한 특정 숫자값받기

                    Menu espressoList = (Menu) espresso.get(espressoNumber - 1); // 고객이 입력한 내용
                    System.out.println(espressoList.getName() + " | " + espressoList.getExplanation() + " | " + espressoList.getPlace());


                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인   2. 취소");
                    int espressoCheck = input.nextInt();

                    if (espressoCheck == 1) {
                        orderList.add(espressoList);
                        System.out.println("선택하신 메뉴가 장바구니에 추가되었습니다.");
                    } else {

                    }
                    break;
                case 2 : ;
                commodity.output(nonCoffee);
                int nonCoffeeNumber = input.nextInt();

                Menu nonCoffeeList = (Menu) nonCoffee.get(nonCoffeeNumber - 1);
                System.out.println(nonCoffeeList.getName() + " | " + nonCoffeeList.getExplanation() + " | " + nonCoffeeList.getPlace());

                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인   2. 취소");
                    int nonCoffeeCheck = input.nextInt();

                    if (nonCoffeeCheck == 1) {
                        orderList.add(nonCoffeeList);
                        System.out.println("선택하신 메뉴가 장바구니에 추가되었습니다.");
                    } else {

                    }
                    break;

                case 3 :
                    commodity.output(dessert);
                    int dessertNumber = input.nextInt();

                    Menu dessertList = (Menu) nonCoffee.get(dessertNumber - 1);
                    System.out.println(dessertList.getName() + " | " + dessertList.getExplanation() + " | " + dessertList.getPlace());

                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인   2. 취소");
                    int dessertCheck = input.nextInt();

                    if (dessertCheck == 1) {
                        orderList.add(dessertList);
                        System.out.println("선택하신 메뉴가 장바구니에 추가되었습니다.");
                    } else {

                    }
                    break;
                case 4 :
                    System.out.println("주문내역을 확인합니다.");
                    System.out.println("[Order]");
                    commodity.outputOrder(orderList); // orderList 를 불러오기 위한 메서드 호출
                    System.out.println("1. 주문    2. 메뉴판");
                    int order1 =  input.nextInt();

                    if(order1 == 1) {
                        System.out.println("주문이 완료되었습니다!");
                        System.out.println("대기번호는 ["+ Order.generateOrderNumber() + "] 번 입니다."); //아직 구현할 수 없는 영역...
                        System.out.println("(2초 후 메뉴판으로 돌아갑니다.)");
                        // n초 후 메뉴판 돌려야함
                        orderList.clear();
                        Order.stop2Second(); // 2초후에 돌아가는 영역

                    } else {
                        System.out.println("메인 메뉴판으로 돌아갑니다.");
                        // 메뉴판으로 돌아가는 영역
                    }
                    break;
                case 5 :
                    System.out.println("진행하던 주문을 취소하시겠습니까?");
                    System.out.println("1.주문초기화     2.메인화면으로 돌아가기");
                    int cancel = input.nextInt();

                    if(cancel == 1) {
                        orderList.clear(); // 고객이 주문을 받았던 내역을 초기화
                    } else {
                        System.out.println("메인 메뉴판으로 돌아갑니다."); // 초기화 없이 메인 메뉴판으로 돌아가게 해줌
                    }
                    break;

                default:

                System.out.println("잘못된 입력입니다.");
            }

        }

    }
}

