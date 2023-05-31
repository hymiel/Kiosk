package Kiosk;

import Project.Commodity;

import java.util.ArrayList;
import java.util.List;

public class Order{    //Product class 상속
    public static void main(String[] args) {

    }
        private List<Commodity> items;

    public Order() {
            this.items = new ArrayList<>();
        }

        public void addItem(Commodity item) {
            items.add(item);
        }

        public void printOrder() {
            System.out.println("[ Orders ]");
            for (Commodity item : items) {
                System.out.println(item.getName() + "   | W " + item.getPrice() / 1000 + "." + item.getPrice() % 1000);
            }
            int total = calculateTotal();
            System.out.println("\n[ Total ]");
            System.out.println("W " + total / 1000 + "." + total % 1000);
        }

        private int calculateTotal() {
            int total = 0;
            for (Commodity item : items) {
                total += item.getPrice();
            }
            return total; //리턴값
        }
    }