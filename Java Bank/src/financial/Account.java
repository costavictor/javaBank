package financial;

import general.ServiceClass;
import java.util.Date;
import java.util.GregorianCalendar;

//abstract method
public abstract class Account {
    
    private int accountNum;
    private double balance;
    private double interestRate;
    //private String accountType;
    private Date creationDate;
   
public Account(double balance, double interestRate, int year, int month, int day){
    this.balance = balance;
    this.accountNum = ServiceClass.getAccountNumber();
    this.interestRate = interestRate;
    this.creationDate = new GregorianCalendar(year, month-1, day).getTime();
    
}

public Account(double balance){
    this.balance = balance;
}

public Date getCreationDate(){
    return this.creationDate;
}

public void setCreationDate(int year, int month, int day){
    this.creationDate = new GregorianCalendar(year, month-1, day).getTime();
}

public double getBalance(){
 
    return balance;
}

public double getInterestRate(){
    return this.interestRate;
}

public double getOverDraftLimit(){
        return 0.0;
    }

public double getCreditLimit(){
        return 0.0;
    }

public void setInterestRate(){
    this.interestRate = interestRate;
}

//abstract method
public abstract double calculateInterest();

}
