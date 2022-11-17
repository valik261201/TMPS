package cars;

public class DieselEngineBuilder extends EngineBuilder{
    @Override
    void buildName() {
        engine.setName("5.0L P565 V8");
    }

    @Override
    void buildVolume() {
        engine.setVolume(4998);
    }

    @Override
    void buildFuel() {
        engine.setFuel(Fuel.diesel);
    }

    @Override
    void buildPrice() {
        engine.setPrice(25000);
    }
}
