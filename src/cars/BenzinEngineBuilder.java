package cars;

public class BenzinEngineBuilder extends EngineBuilder {
    @Override
    void buildName() {
        engine.setName("2JZ-GTE");
    }

    @Override
    void buildVolume() {
        engine.setVolume(2999);
    }

    @Override
    void buildFuel() {
        engine.setFuel(Fuel.benzin);
    }

    @Override
    void buildPrice() {
        engine.setPrice(11000);
    }
}
