package question2;

public class BrazilAmericano extends Coffee {
    BrazilAmericano() {
        this.info = "BrazilAmericano";
    }

    @Override
    public void brewing() {
        System.out.printf("BrazilAmericano");
    }
}
