package factoryPatternBank;

public class Sacombank extends Bank{
    private String serviceInfo;
    private String promotionInfo;

    public Sacombank(String serviceInfo, String promotionInfo) {
        this.serviceInfo = serviceInfo;
        this.promotionInfo = promotionInfo;
    }

    public String getServiceInfo() {
        return serviceInfo;
    }

    public String getPromotionInfo() {
        return promotionInfo;
    }
}
