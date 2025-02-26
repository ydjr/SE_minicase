public class TradeInVehicle {
    private String serialNumber;
    private String make;
    private String model;
    private int year;

    public TradeInVehicle(String serialNumber, String make, String model, int year) {
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayTradeInInfo() {
        System.out.println("Trade-in Vehicle Serial Number: " + serialNumber);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
