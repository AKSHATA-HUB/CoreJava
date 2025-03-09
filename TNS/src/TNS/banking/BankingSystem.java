package 	TNS.banking;

import java.util.*;

public class BankingSystem {
    private static BankingService bankingService = new BankingServiceImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Banking System ===");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Account");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by ID");
            System.out.println("6. List all Accounts of a Customer");
            System.out.println("7. List all Transactions of an Account");
            System.out.println("8. List all Beneficiaries of a Customer");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addCustomer();
                case 2 -> addAccount();
                case 3 -> addBeneficiary();
                case 4 -> addTransaction();
                case 5 -> findCustomerById();
                case 6 -> listAccountsByCustomerId();
                case 7 -> listTransactionsByAccountId();
                case 8 -> listBeneficiariesByCustomerId();
                case 9 -> {
                    System.out.println("Thank you for using the Banking System!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addCustomer() {
        System.out.print("Customer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Contact Number: ");
        String contact = scanner.nextLine();

        bankingService.addCustomer(new Customer(id, name, address, contact));
        System.out.println("Customer added successfully!");
    }

    private static void addAccount() {
        System.out.print("Account ID: ");
        int accountId = scanner.nextInt();
        System.out.print("Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Account Type (Savings/Current): ");
        String type = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double balance = scanner.nextDouble();

        if (bankingService.findCustomerById(customerId) == null) {
            System.out.println("Customer ID not found!");
            return;
        }

        bankingService.addAccount(new Account(accountId, customerId, type, balance));
        System.out.println("Account created successfully!");
    }

    private static void addBeneficiary() {
        System.out.print("Beneficiary ID: ");
        int beneficiaryId = scanner.nextInt();
        System.out.print("Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Beneficiary Name: ");
        String name = scanner.nextLine();
        System.out.print("Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Bank Details: ");
        String bankDetails = scanner.nextLine();

        bankingService.addBeneficiary(new Beneficiary(beneficiaryId, customerId, name, accountNumber, bankDetails));
        System.out.println("Beneficiary added successfully!");
    }

    private static void addTransaction() {
        System.out.print("Transaction ID: ");
        int transactionId = scanner.nextInt();
        System.out.print("Account ID: ");
        int accountId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Transaction Type (Deposit/Withdrawal): ");
        String type = scanner.nextLine();
        System.out.print("Amount: ");
        double amount = scanner.nextDouble();

        Account account = bankingService.findAccountById(accountId);
        if (account == null) {
            System.out.println("Account ID not found!");
            return;
        }

        if (type.equalsIgnoreCase("Withdrawal") && account.getBalance() < amount) {
            System.out.println("Insufficient balance. Transaction failed.");
            return;
        }

        bankingService.addTransaction(new Transaction(transactionId, accountId, type, amount));
        System.out.println("Transaction successful!");
    }

    private static void findCustomerById() {
        System.out.print("Customer ID: ");
        int id = scanner.nextInt();
        Customer customer = bankingService.findCustomerById(id);
        System.out.println(customer != null ? customer : "Customer not found.");
    }

    private static void listAccountsByCustomerId() {
        System.out.print("Customer ID: ");
        int customerId = scanner.nextInt();
        List<Account> accounts = bankingService.getAccountsByCustomerId(customerId);
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            accounts.forEach(System.out::println);
        }
    }

    private static void listTransactionsByAccountId() {
        System.out.print("Account ID: ");
        int accountId = scanner.nextInt();
        List<Transaction> transactions = bankingService.getTransactionsByAccountId(accountId);
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            transactions.forEach(System.out::println);
        }
    }

    private static void listBeneficiariesByCustomerId() {
        System.out.print("Customer ID: ");
        int customerId = scanner.nextInt();
        List<Beneficiary> beneficiaries = bankingService.getBeneficiariesByCustomerId(customerId);
        if (beneficiaries.isEmpty()) {
            System.out.println("No beneficiaries found.");
        } else {
            beneficiaries.forEach(System.out::println);
        }
    }
}
