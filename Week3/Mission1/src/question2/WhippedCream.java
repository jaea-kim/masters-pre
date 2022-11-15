package question2;

public class WhippedCream extends OptionDecorator {

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getInfo() {
        return coffee.getInfo() + " Adding WhippedCream";
    }

}
