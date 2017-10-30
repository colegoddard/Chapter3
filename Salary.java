// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class Salary
{
   public static void main (String[] args)
   {
           double currentSalary;  // employee's current  salary
           double newSalary;          // new salary for the employee
           String rating;             // performance rating
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the current salary: ");
           currentSalary = scan.nextDouble();
           System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
           rating = scan.next();
 
           // Compute the raise using if ...
           if (rating.equals("Poor")) {
               double raise = 1.015;
               newSalary = currentSalary * raise;
               NumberFormat money = NumberFormat.getCurrencyInstance();
               System.out.println();
               System.out.println("Current Salary:           " + money.format(currentSalary));
               System.out.println("Amount of your raise: " + money.format(0.015 * currentSalary));
               System.out.println("Your new salary:          " + money.format(newSalary));
               System.out.println();
           }
           if (rating.equals("Good")) {
               double raise = 1.04;
               newSalary = currentSalary * raise;
               NumberFormat money = NumberFormat.getCurrencyInstance();
               System.out.println();
               System.out.println("Current Salary:           " + money.format(currentSalary));
               System.out.println("Amount of your raise: " + money.format(0.04 * currentSalary));
               System.out.println("Your new salary:          " + money.format(newSalary));
               System.out.println();
           }
           if (rating.equals("Excellent")) {
               double raise = 1.06;
               newSalary = currentSalary * raise;
               NumberFormat money = NumberFormat.getCurrencyInstance();
               System.out.println();
               System.out.println("Current Salary:           " + money.format(currentSalary));
               System.out.println("Amount of your raise: " + money.format(0.06 * currentSalary));
               System.out.println("Your new salary:          " + money.format(newSalary));
               System.out.println();
            }
        }
}