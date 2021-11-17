package factoryPatternBank;

public abstract class Bank {
    public abstract String getServiceInfo() ;

    public abstract String getPromotionInfo() ;

    @Override
    public String toString() {
        return "Bank{" +
                "serviceInfo='" + getServiceInfo() + '\'' +
                ", promotionInfo='" + getPromotionInfo() + '\'' +
                '}';
    }
}
