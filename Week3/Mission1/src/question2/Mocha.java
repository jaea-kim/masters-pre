package question2;

public class Mocha extends OptionDecorator {

    public Mocha(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getInfo() {
        return coffee.getInfo() + " Adding Mocha Syrup";
    }

}
