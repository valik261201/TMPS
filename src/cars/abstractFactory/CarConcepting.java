package cars.abstractFactory;

import cars.abstractFactory.carConcepting.CarConceptingTeamFactory;

public class CarConcepting {
    public static void main(String[] args) {
        CarConceptTeamFactory carConceptTeamFactory = new CarConceptingTeamFactory();
        Dev developer = carConceptTeamFactory.getDev();
        Designer designer = carConceptTeamFactory.getDesigner();

        System.out.println("Concepting car");
        developer.writeCode();
        designer.createDesign();
    }
}
