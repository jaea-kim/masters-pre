package question2;

public class Mocha extends OptionDecorator {
    private Coffee coffee;

    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getInfo() {
        return coffee.getInfo() + " Adding Mocha Syrup";
    }

    @Override
    public void brewing() {
        System.out.printf(getInfo());
    }
}
