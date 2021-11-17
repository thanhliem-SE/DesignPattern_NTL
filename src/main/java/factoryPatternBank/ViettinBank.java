package factoryPatternBank;

public class ViettinBank extends Bank{
    private String serviceInfo;
    private String promotionInfo;

    public ViettinBank(String serviceInfo, String promotionInfo) {
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
