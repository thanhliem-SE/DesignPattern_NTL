package factoryPatternCar;

public abstract class Car {
    public abstract String getInformation();

    public abstract String getConfiguration();

    public abstract String getProducer();

    public abstract String getTechnicalFeatures();

    @Override
    public String toString() {
        return "Car{" +
                "information='" + getInformation() + '\'' +
                ", configuration='" + getConfiguration() + '\'' +
                ", producer='" + getProducer() + '\'' +
                ", technicalFeatures='" + getTechnicalFeatures() + '\'' +
                '}';
    }

}
