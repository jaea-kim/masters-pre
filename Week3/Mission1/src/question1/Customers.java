package question1;

import java.util.ArrayList;
public class Customers {
    private ArrayList<Member> customers = new ArrayList<Member>();

    Customers() {
        registerCustomer();
    }

    public void registerCustomer() {
        customers.add(new RedMember("James", 10000, 2));
        customers.add(new RedMember("Tomas", 30000, 2));
        customers.add(new PlatinumMember("Edward", 10000, 2));
        customers.add(new PlatinumMember("Percy", 30000, 2));
        customers.add(new DiamondMember("Elizabet", 30000, 2));
    }

    public void printCustomerAllInfo() {
        String sentence = "%s님의 지불 금액은 %d원이고, 적립 포인트는 %s점 입니다.\n주차 요금은 %d원 입니다.\n\n";

        for(int i = 0; i < customers.size(); i++) {
            System.out.printf(sentence, customers.get(i).customerName, customers.get(i).getPrice(), customers.get(i).getBonusPoint(), customers.get(i).getParkingFee());
        }
    }

}
