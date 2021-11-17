package factoryPatternBank;

public class BankFactory{
    public static Bank getBank(String type, String serviceInfo, String promotionInfo){
        if(type.equalsIgnoreCase("ACB"))
            return new ACB(serviceInfo, promotionInfo);
        else if(type.equalsIgnoreCase("Sacombank"))
            return new Sacombank(serviceInfo, promotionInfo);
        else if(type.equalsIgnoreCase("ViettinBank"))
            return new ViettinBank(serviceInfo, promotionInfo);
        return null;
    }
}
