package TNS.banking;

import java.util.*;

public class BankingServiceImpl implements BankingService {
    private Map<Integer, Customer> customers = new HashMap<>();
    private Map<Integer, Account> accounts = new HashMap<>();
    private List<Transaction> transactions = new ArrayList<>();
    private List<Beneficiary> beneficiaries = new ArrayList<>();

    @Override
    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public void addAccount(Account account) {
        accounts.put(account.getAccountId(), account);
    }

    @Override
    public void addBeneficiary(Beneficiary beneficiary) {
        beneficiaries.add(beneficiary);
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        Account account = accounts.get(transaction.getAccountId());
        if (account != null) {
            if ("Deposit".equalsIgnoreCase(transaction.getType())) {
                account.updateBalance(transaction.getAmount());
            } else if ("Withdrawal".equalsIgnoreCase(transaction.getType())) {
                if (account.getBalance() >= transaction.getAmount()) {
                    account.updateBalance(-transaction.getAmount());
                } else {
                    System.out.println("Insufficient balance. Transaction failed.");
                }
            }
        }
    }

    @Override
    public Customer findCustomerById(int id) {
        return customers.get(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accounts.get(id);
    }

    @Override
    public List<Account> getAccountsByCustomerId(int customerId) {
        List<Account> customerAccounts = new ArrayList<>();
        for (Account account : accounts.values()) {
            if (account.getCustomerId() == customerId) {
                customerAccounts.add(account);
            }
        }
        return customerAccounts;
    }

    @Override
    public List<Transaction> getTransactionsByAccountId(int accountId) {
        List<Transaction> accountTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getAccountId() == accountId) {
                accountTransactions.add(transaction);
            }
        }
        return accountTransactions;
    }

    @Override
    public List<Beneficiary> getBeneficiariesByCustomerId(int customerId) {
        List<Beneficiary> customerBeneficiaries = new ArrayList<>();
        for (Beneficiary beneficiary : beneficiaries) {
            if (beneficiary.getCustomerId() == customerId) {
                customerBeneficiaries.add(beneficiary);
            }
        }
        return customerBeneficiaries;
    }
}
