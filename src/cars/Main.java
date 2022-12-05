package cars;

import cars.abstractFactory.CarConceptTeamFactory;
import cars.abstractFactory.Designer;
import cars.abstractFactory.Dev;
import cars.abstractFactory.carConcepting.CarConceptingTeamFactory;

public class Main {


    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        CarConceptTeamFactory carConceptTeamFactory = new CarConceptingTeamFactory();
        Dev developer = carConceptTeamFactory.getDev();
        Designer designer = carConceptTeamFactory.getDesigner();

        
        engineer.setEngineer(new DieselEngineBuilder());
        Engine engine = engineer.buildEngine();




        System.out.println("Concepting car");
        developer.writeCode();
        designer.createDesign();

        Car.getCar().addCarToList("Mercedes-Benz");
        System.out.println("Car:"+ Car.getCar().getManufacturers());

        Project master = new Project(1, Car.getCar().getManufacturers(), engine);
        System.out.println(engine);

        ProjectFactory factory = new ProjectFactory(master);
        System.out.println(master);

        Project masterClone = factory.cloneProject();
        System.out.println(masterClone);

    }
}