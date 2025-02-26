public class Invoice {
    private String invoiceID;
    private String date;
    private Customer customerInfo;
    private TradeInVehicle tradeInInfo;  
    private double tradeInAllowance;
    private Vehicle purchasedInfo;
    private DealerInstalledOption dealerInstalledOptions;
    private double taxes;
    private double licenseFees;
    private String customerSignature;

    public Invoice(String invoiceID, String date, Customer customerInfo, TradeInVehicle tradeInInfo, double tradeInAllowance, Vehicle purchasedInfo, DealerInstalledOption dealerInstalledOptions, double taxes, double licenseFees, String customerSignature) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.customerInfo = customerInfo;
        this.tradeInInfo = tradeInInfo;
        this.tradeInAllowance = tradeInAllowance;
        this.purchasedInfo = purchasedInfo;
        this.dealerInstalledOptions = dealerInstalledOptions;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.customerSignature = customerSignature;
    }

    public double sumFinalNegotiatedPrice() {
        return purchasedInfo.getBaseCost() - tradeInAllowance + taxes + licenseFees;
    }

    public void displayInvoice() {
        System.out.println("Invoice ID: " + invoiceID);
        System.out.println("Date: " + date);
        customerInfo.displayCustomerInfo();
        purchasedInfo.displayVehicleInfo();
        System.out.println("Trade-in Allowance: $" + tradeInAllowance);
        System.out.println("Taxes: $" + taxes);
        System.out.println("License Fees: $" + licenseFees);
        System.out.println("Final Negotiated Price: $" + sumFinalNegotiatedPrice());
    }
}
