package factoryPatternBank;

public class ACB extends Bank{
    private String serviceInfo;
    private String promotionInfo;

    public ACB(String serviceInfo, String promotionInfo) {
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
