package question2;

public class Latte extends OptionDecorator {

    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getInfo() {
        return coffee.getInfo() + " Adding Milk";
    }

}
