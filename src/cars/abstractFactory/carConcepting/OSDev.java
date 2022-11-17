package cars.abstractFactory.carConcepting;

import cars.abstractFactory.Dev;

public class OSDev implements Dev {
    @Override
    public void writeCode() {
        System.out.println("OS developer writes code for car OS.");
    }
}
