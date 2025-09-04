public class Main {
    public static void main(String[] args) {
    Engine engine = new Engine(EngineType.GAS, 2500, 250);
    Car car = new Car(engine, CarType.CABRIOLET,3500);
        System.out.println("Тип авто / CarType: " + car.getCarType());
        System.out.println("Тип двигателя / EngineType: " + car.getEngine().getEngineType());
        System.out.println("Объем / EngineVolume: " + car.getEngine().getVolume());
        System.out.println("Мощность / EnginePower: " + car.getEngine().getPower());
        System.out.println("Вес / Weight: " + car.getWeight());

    }
}
