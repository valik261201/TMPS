package cars;

public class VersionControlRunner {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        engineer.setEngineer(new DieselEngineBuilder());
        Engine engine = engineer.buildEngine();
        Project master = new Project(1, "SuperProject", engine);

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);

        Project masterClone = factory.cloneProject();
        System.out.println(masterClone);
    }
}
