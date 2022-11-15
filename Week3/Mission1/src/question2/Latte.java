package question2;

public class Latte extends Coffee {
    private Coffee coffee;

    public Latte(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getInfo() {
        return coffee.getInfo() + " Adding Milk";
    }
    @Override
    public void brewing() {
        System.out.printf(getInfo());
    }

}
