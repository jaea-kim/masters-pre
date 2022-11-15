package question1;
public class HyundaiFactory {
    private int carNumber = 1000;
    private static HyundaiFactory factory = new HyundaiFactory(); //단 하나 factory 객체 생성
    private HyundaiFactory() { }
    static HyundaiFactory getFactory() { //if문 null일 때 return
        return factory;
    }

    public Car createCar() {
        carNumber += 1;
        return new Car(carNumber);
    }


}
