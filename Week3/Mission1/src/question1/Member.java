package question1;

public class Member {
    protected String customerName;
    protected int price;
    protected double stayTime;
    protected String customerGrade;
    protected double discountRate;
    protected double bonusRate;
    protected int parkingFee;
    protected boolean isCounselor;
    Member(String customerName, int price, double stayTime) {
        this.customerName = customerName;
        this.price = price;
        this.stayTime = stayTime;
        isCounselor = false;
    }

    public int getPrice() {
        return price - (int)(price * discountRate);
    }

    public int getBonusPoint() {
        return (int)(price * bonusRate);
    }

    public int getParkingFee() {
        return (int)(stayTime * parkingFee);
    }
}

