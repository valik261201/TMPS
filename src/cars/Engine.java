package cars;

public class Engine {
    private String name;
    private int volume;
    private Fuel fuel;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setFuel(Fuel fuel) {
        this.fuel= fuel;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", fuel=" + fuel +
                ", price=" + price +
                '}';
    }
}
