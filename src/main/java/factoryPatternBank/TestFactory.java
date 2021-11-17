package factoryPatternBank;

public class TestFactory {
    public static void main(String[] args) {
        Bank acb = BankFactory.getBank("ACB", "Giới thiệu người mới", "Tặng 50k vào tài khoản");
        Bank sacombank = BankFactory.getBank("Sacombank", "Giới thiệu người mới", "Tặng 50k vào tài khoản");
        Bank viettinbank = BankFactory.getBank("Viettinbank", "Giới thiệu người mới", "Tặng 50k vào tài khoản");

        System.out.println("==> ACB: " + acb);
        System.out.println("==> Sacombank: " + sacombank);
        System.out.println("==> Viettinbank: " + viettinbank);
    }
}
