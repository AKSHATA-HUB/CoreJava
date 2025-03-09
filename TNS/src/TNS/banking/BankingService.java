package TNS.banking;
import java.util.List;

public interface BankingService {
    void addCustomer(Customer customer);
    void addAccount(Account account);
    void addBeneficiary(Beneficiary beneficiary);
    void addTransaction(Transaction transaction);
    Customer findCustomerById(int id);
    Account findAccountById(int id);
    List<Account> getAccountsByCustomerId(int customerId);
    List<Transaction> getTransactionsByAccountId(int accountId);
    List<Beneficiary> getBeneficiariesByCustomerId(int customerId);
}
