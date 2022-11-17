package cars;

public class Project implements Copyable{
    private int id;
    private String projectName;
    private Engine engine;

    public Project(int id, String carName, Engine engine) {
        this.id = id;
        this.projectName = carName;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String name) {
        this.projectName = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id, projectName, engine);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
