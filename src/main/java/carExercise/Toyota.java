package carExercise;

public class Toyota extends Car {
    private String information;
    private String configuration;
    private String producer;
    private String technicalFeatures;

    public Toyota(String information, String configuration, String producer, String technicalFeatures) {
        this.information = information;
        this.configuration = configuration;
        this.producer = producer;
        this.technicalFeatures = technicalFeatures;
    }

    public String getInformation() {
        return information;
    }

    public String getConfiguration() {
        return configuration;
    }

    public String getProducer() {
        return producer;
    }

    public String getTechnicalFeatures() {
        return technicalFeatures;
    }
}
