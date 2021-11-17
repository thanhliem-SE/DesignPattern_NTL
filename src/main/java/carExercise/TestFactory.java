package carExercise;

public class TestFactory {
    public static void main(String[] args) {
        Car honda = CarFactory.getCar("Xe hơi Honda", "4 bánh", "Honda", "gia tốc nhanh");
        Car nexus = CarFactory.getCar("Xe hơi Nexus", "4 bánh", "Nexus", "gia tốc nhanh");
        Car toyota = CarFactory.getCar("Xe hơi Toyota", "4 bánh", "Toyota", "gia tốc nhanh");

        System.out.println("==> Factory Honda Car Config: " + honda);
        System.out.println("==> Factory Nexus Car Config: " + nexus);
        System.out.println("==> Factory Toyota Car Config: " + toyota);

    }
}
