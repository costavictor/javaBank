package financial;

import general.ServiceClass;

public class CheckingAccount extends Account {
    
    private double overDraftLimit;
    
    public CheckingAccount(double balance, int year, int month, int day, double overDraftLimit, 
            double interestRate){
        
        //this sends data to the account Super class
        super(balance, interestRate, year, month, day);
        
        this.overDraftLimit = overDraftLimit;
        
        
        //create an account number
    }
    
    @Override
    public double getOverDraftLimit(){
        return this.overDraftLimit;
    }
    
    public void setCreditLimit(){
        this.overDraftLimit = overDraftLimit;
    }
    
    @Override
    public double calculateInterest(){
        //logic to calculate the interest
        double tempBalance;
        if (super.getBalance()<0) {
           tempBalance = -super.getBalance()*(super.getInterestRate()/100);
        }
        else {
           tempBalance = 0;
        }
        return tempBalance;             
        }
    }

