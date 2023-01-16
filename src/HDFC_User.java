import java.util.UUID;

public class HDFC_User implements BankInterface {

    // Attributes
    private String name;
    private String accpuntNo;
    private double balance;
    private String password;
    private static double rateOfInterest;
    // Create getters and setters for all function

    public HDFC_User(String name, double balance, String enteredPassword) {
        this.name =  name;
        this.balance = balance;
        this.password = enteredPassword;
        this.rateOfInterest = 6.5;
        this.accpuntNo = String.valueOf(UUID.randomUUID());
    }
    @Override
    public double checkBalance() {
        return 0;
    }

    @Override
    public String addMoney(int amount) {
        return null;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        return null;
    }

    @Override
    public double calculateInterest(int years) {
        return 0;
    }
}
