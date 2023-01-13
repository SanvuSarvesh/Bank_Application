import java.util.Objects;
import java.util.UUID;

public class SBI_User implements BankInterface {
    // Attributes
    private String name;
    private String accpuntNo;
    private double balance;
    private String password;
    private static double rateOfInterest;
    // Create getters and setters for all function
    public SBI_User(String name, double balance, String enteredPassword){
        // Given By user itself
        this.name =  name;
        this.balance = balance;
        this.password = enteredPassword;

        // Assigned by the bank
        this.rateOfInterest = 6.5;
        this.accpuntNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccpuntNo() {
        return accpuntNo;
    }

    public void setAccpuntNo(String accpuntNo) {
        this.accpuntNo = accpuntNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        SBI_User.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance += amount;
        return "Amount has been Credited..." + "New Balance is "+String.valueOf(balance);
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword, password)){
            //double remainingAmount = balance - amount;
            if(amount > balance){
                return "Lol..., Go and earn first and then come again. Idiot!!";
            }
            else{
                balance -= amount;
                return "Your amount has been debited, Now Enjoy!!"+" Your new Balance is "+ String.valueOf(balance);
            }
        }
        else{
            return "Opps!! You have entered wrong password...";
        }
    }

    @Override
    public double calculateInterest(int years) {
        double interest = (balance*years*rateOfInterest)/100;
        return interest;
    }
}

// If anything is written using @override it means it's annotation.
