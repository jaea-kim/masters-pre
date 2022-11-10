package question1;

import java.util.ArrayList;

public class HyundaiFactory {
    private int carNumber = 1000;
    private static HyundaiFactory factory = new HyundaiFactory(); //단 하나 factory 객체 생성
    private HyundaiFactory() { }
    static HyundaiFactory getFactory() {
        return factory;
    }

    public Car createCar() {
        carNumber += 1;
        return new Car(carNumber);
    }


}
