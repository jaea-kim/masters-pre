package question2;

public abstract class Coffee {

    public abstract String getInfo();
    public void brewing() {
        System.out.printf(getInfo());
    }
}
