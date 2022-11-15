package question2;

public abstract class OptionDecorator extends Coffee {
    protected Coffee coffee;
   public OptionDecorator(Coffee coffee) {
       this.coffee = coffee;
   }
}
