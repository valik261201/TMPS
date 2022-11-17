package cars.abstractFactory.carConcepting;

import cars.abstractFactory.Designer;

public class ExteriorDesigner implements Designer {
    @Override
    public void createDesign() {
        System.out.println("Designer creates name for car.");
    }
}
