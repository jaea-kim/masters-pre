package question1;

public class DiamondMember extends Member {
    DiamondMember(String customerName, int price, double stayTime) {
        super(customerName, price, stayTime);
        this.customerGrade = "DIAMOND";
        discountRate = 0.1;
        bonusRate = 0.1;
        parkingFee = 0;
        isCounselor = true;
    }
}
