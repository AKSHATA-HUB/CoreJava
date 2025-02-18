package System;



import java.util.Scanner;

interface Transaction {
 void processTransaction(double amount);
}

//GPay Transaction Class
class GPayTransaction implements Transaction {
 public void processTransaction(double amount) {
     System.out.println("GPay transaction successful! Amount: Rs. " + amount);
 }
}

//Check Transaction Class
class CheckTransaction implements Transaction {
 public void processTransaction(double amount) {
     System.out.println("Check deposited successfully! Amount: Rs. " + amount);
 }
}

//PhonePe Transaction Class
class PhonePeTransaction implements Transaction {
 public void processTransaction(double amount) {
     System.out.println("PhonePe transaction successful! Amount: Rs. " + amount);
 }
}

//Bank Transfer Transaction Class
class BankTransferTransaction implements Transaction {
 public void processTransaction(double amount) {
     System.out.println("Bank Transfer successful! Amount: Rs. " + amount);
 }
}

public class TranscationSystem {
	
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Choose transaction method:");
     System.out.println("1. GPay");
     System.out.println("2. Check");
     System.out.println("3. PhonePe");
     System.out.println("4. Bank Transfer");
     System.out.print("Enter your choice: ");
     int choice = scanner.nextInt();
     
     System.out.print("Enter amount: Rs. ");
     double amount = scanner.nextDouble();
     
     Transaction transaction = null;
     
     switch (choice) {
         case 1:
             transaction = new GPayTransaction();
             break;
         case 2:
             transaction = new CheckTransaction();
             break;
         case 3:
             transaction = new PhonePeTransaction();
             break;
         case 4:
             transaction = new BankTransferTransaction();
             break;
         default:
             System.out.println("Invalid choice! Please select a valid transaction method.");
             return;
     }
     
     transaction.processTransaction(amount);
     
     scanner.close();
 }
}



