package cars.abstractFactory.carConcepting;

import cars.abstractFactory.Designer;
import cars.abstractFactory.Dev;

public class CarConceptingTeamFactory implements cars.abstractFactory.CarConceptTeamFactory {

    @Override
    public Dev getDev() {
        return new OSDev();
    }

    @Override
    public Designer getDesigner() {
        return new ExteriorDesigner();
    }
}
