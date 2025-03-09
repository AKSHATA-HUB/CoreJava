package TNS.banking;

public class Beneficiary {
    private int beneficiaryId;
    private int customerId;
    private String name;
    private String accountNumber;
    private String bankDetails;

    public Beneficiary(int beneficiaryId, int customerId, String name, String accountNumber, String bankDetails) {
        this.beneficiaryId = beneficiaryId;
        this.customerId = customerId;
        this.name = name;
        this.accountNumber = accountNumber;
        this.bankDetails = bankDetails;
    }

    public int getBeneficiaryId() {
        return beneficiaryId;
    }

    public int getCustomerId() {  // ADD THIS METHOD
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBankDetails() {
        return bankDetails;
    }
}
