package question2;

public class WhippedCream extends OptionDecorator {
    private Coffee coffee;

    public WhippedCream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getInfo() {
        return coffee.getInfo() + " Adding WhippedCream";
    }
    @Override
    public void brewing() {
        System.out.printf(getInfo());
    }
}
