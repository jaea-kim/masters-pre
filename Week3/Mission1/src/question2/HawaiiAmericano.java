package question2;

public class HawaiiAmericano extends Coffee {
    HawaiiAmericano() {
        this.info = "HawaiiAmericano";
    }

    @Override
    public void brewing() {
        System.out.printf("HawaiiAmericano");
    }
}
