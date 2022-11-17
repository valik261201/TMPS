package cars;

public class Engineer {
    EngineBuilder builder;

    public void setEngineer(EngineBuilder builder) {
        this.builder = builder;
    }

    Engine buildEngine(){
        builder.createEngine();
        builder.buildName();
        builder.buildVolume();
        builder.buildFuel();
        builder.buildPrice();

        Engine engine = builder.getEngine();

        return engine;
    }
}
