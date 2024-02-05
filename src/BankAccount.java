//Day 2 WorkShop - Task 1


import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccount {
    private final String acctName;
    private final String acctNo;
    private float acctBal;
    private List<String> transactions;
    private boolean isActive;
    private Date creationDate;
    private Date closingDate;

    //Two Constructors

    public BankAccount(String acctName) {
        this.acctNo = generateRandomNumber();
        this.acctName = acctName;
        this.acctBal= 0;
        this.isActive = true;

        if (transactions == null) {
            transactions = new ArrayList<>();
        }
    }

    public BankAccount(String acctName, float acctBal) {
        this.acctNo = generateRandomNumber();
        this.acctName = acctName;
        this.acctBal = acctBal;
        this.isActive = true;

        if (transactions ==null) {
            transactions = new ArrayList<>();
        }
    }

    //Getters and Setters- acctName and acctNo only getters no need setters cos dont want to change after creating 

    public String getAcctName() {
        return acctName;
    }

    public String getAcctNo() {
        return acctNo;
    }

    

    public float getAcctBal() {
        return acctBal;
    }

    public void setAcctBal(float acctBal) {
        this.acctBal = acctBal;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    //Method to generate random number
     private String generateRandomNumber() {
        int beginningAscii = 65;
        int endAscii = 90;
        int acctLength = 10;

        Random random = new Random();
        String acctNo = "";

        for (int i = 0; i<acctLength; i++) {
            float generatedNo = beginningAscii + (random.nextFloat()*(endAscii - beginningAscii +1));
            acctNo = acctNo + String.valueOf(generatedNo);
            
        }
        return acctNo;
     }

     //Method to deposit amt

     private void deposit(float amt) {
        if (isActive) {
            if (amt > 0) {
                this.acctBal = this.acctBal + amt;

                LocalDate currrentDate = LocalDate.now();
                String log = "Deposit $" + amt + " at " + currrentDate;
                transactions.add(log);
                // System.out.println(log);

            } else {
                throw new IllegalArgumentException("Amount to be deposited must be more than zero.");

            }
        }
     }

     //Method to withdraw amt

     public void withdraw(float amt) {
        if (isActive) {
            if (amt<acctBal) {
                this.acctBal = this.acctBal - amt;

                LocalDate currentDate = LocalDate.now();
                String log = "Withdrawed $" + amt + " at " + currentDate;
                transactions.add(log);
                // System.out.println(log);

            } else if (amt>acctBal){
                throw new IllegalArgumentException("You cannot withdraw more than what you have.");
            } else {
                throw new IllegalArgumentException();
            }
        }
     }

     //Test Cases created to run
     public static void main(String[] args) {
        BankAccount bankA = new BankAccount("Sharon Lee",2000);
        bankA.withdraw(1000);

        List<String> retrievedTransactionsList = bankA.getTransactions();
        System.out.println("Recent Transactions: ");;
        for (String retrieved:retrievedTransactionsList) {
            System.out.println(retrieved);
        }
         //Using getters only retrieve the values and does not print it to the terminal. Need to store it in a string variable and then print it out. If it is a list then you need to store it in a list and reiterate through the elements to retrieve the list.
     }

}


