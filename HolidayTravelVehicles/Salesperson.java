public class Salesperson {
    private String salespersonID;
    private String name;

    public Salesperson(String salespersonID, String name) {
        this.salespersonID = salespersonID;
        this.name = name;
    }

    public void displaySalespersonInfo() {
        System.out.println("Salesperson ID: " + salespersonID);
        System.out.println("Name: " + name);
    }
}
