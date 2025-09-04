public class Car {
    public final Engine engine;
    public final CarType carType;
    public final int weight;

    public Car(Engine engine, CarType carType, int weight) {
        this.engine = engine;
        this.carType = carType;
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getWeight() {
        return weight;
    }
}
