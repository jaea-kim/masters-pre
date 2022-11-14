package question1;

public class RedMember extends Member {

    RedMember(String customerName, int price, double stayTime) {
        super(customerName, price, stayTime);
        this.customerGrade = "RED";
        discountRate = 0;
        bonusRate = 0.01;
        parkingFee = 3000;
    }

}
