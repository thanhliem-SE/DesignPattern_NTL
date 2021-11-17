package factoryPatternCar;

public class CarFactory {
    public static Car getCarFactory(String information, String configuration, String producer, String technicalFeatures) {
        if (producer.equalsIgnoreCase("Honda")) {
            return new Honda(information, configuration, producer, technicalFeatures);
        } else if (producer.equalsIgnoreCase("Nexus")) {
            return new Nexus(information, configuration, producer, technicalFeatures);
        } else if (producer.equalsIgnoreCase("Toyota")) {
            return new Toyota(information, configuration, producer, technicalFeatures);
        }
        return null;
    }
}
