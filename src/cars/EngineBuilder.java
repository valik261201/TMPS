package cars;

public abstract class EngineBuilder {
    Engine engine;

    void createEngine() {
        engine = new Engine();
    }

    abstract void buildName();

    abstract void buildVolume();

    abstract void buildFuel();

    abstract void buildPrice();

    Engine getEngine() {
        return engine;
    }
}
