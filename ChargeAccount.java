import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double accountBalance;
        double additionalCharges;
        double minimumPayment = 0;
        double interest = 0;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.print ("Enter the account balance: ");
        accountBalance = scan.nextDouble();
        System.out.print ("Enter the total amount of additional charges during the month: ");
        additionalCharges = scan.nextDouble();
        
        if (accountBalance == 0) { 
            interest = 0;
        }    
        else if (accountBalance > 0) {
            interest = (accountBalance + additionalCharges) * 0.02;
        }
        
        double newBalance = accountBalance + additionalCharges + interest;
        
        if (accountBalance < 50) {
            minimumPayment = accountBalance;
        }
        else if (accountBalance >= 50 && accountBalance <= 300) {
            minimumPayment = 50;
        }
        else if (accountBalance > 300) {
            minimumPayment = (1.2 * accountBalance);
        }
        
        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        System.out.println(" ");
        System.out.println("Previous Balance: " + money.format(accountBalance));
        System.out.println("Additional Charges: " + money.format(additionalCharges));
        System.out.println("Interest: " + money.format(interest));
        System.out.println(" ");
        System.out.println("New Balance: " + money.format(newBalance));
        System.out.println(" ");
        System.out.println("Minimum Payment: " + money.format(minimumPayment));
    }
} 