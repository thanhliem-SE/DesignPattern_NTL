package builderPattern;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
        System.out.println("==> COMPUTER: " + comp);

        Student student = new Student.StudentBuilder("007", "Jame Bond", "Spy", 30, "male")
                .setAddress("Ho Chi Minh City, Vietnam")
                .setFatherName("Liam Bond")
                .setMotherName("Lily")
                .setReligion("None")
                .setNationality("USA")
                .build();
        System.out.println("==> STUDENT: " + student);
    }
}