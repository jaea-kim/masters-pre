package question2;

public class KenyaAmericano extends Coffee {
    KenyaAmericano() {
        this.info = "KenyaAmericano";
    }

    @Override
    public void brewing() {
        System.out.printf("KenyaAmericano");
    }
}
