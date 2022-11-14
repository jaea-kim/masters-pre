package question1;

public class PlatinumMember extends Member {

    PlatinumMember(String customerName, int price, double stayTime) {
        super(customerName, price, stayTime);
        this.customerGrade = "PLATINUM";
        discountRate = 0.05;
        bonusRate = 0.05;
        parkingFee = 1000;
    }
}
