package cars;

public class BuildEngineRunner {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();

        engineer.setEngineer(new BenzinEngineBuilder());
        Engine engine = engineer.buildEngine();

        System.out.println(engine);
    }
}
