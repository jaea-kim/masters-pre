package question2;

public class EtiopiaAmericano extends Coffee {
    EtiopiaAmericano() {
        this.info = "EtiopiaAmericano";
    }

    @Override
    public void brewing() {
        System.out.printf("EtiopiaAmericano");
    }
}
