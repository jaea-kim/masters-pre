package question2;

public abstract class Coffee {
    protected String info = "음료 없음";

    public String getInfo() {
        return info;
    }
    public void brewing() {
        System.out.printf(info);
    }
}
