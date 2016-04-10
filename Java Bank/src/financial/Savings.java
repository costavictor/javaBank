package financial;

import general.ServiceClass;

public class Savings extends Account{
     
    public Savings(double balance, double interestRate, int year, int month, int day){
       
       super(balance, interestRate, year, month, day);
       

    }
    
    @Override
    public double calculateInterest(){
        //write logic to calculate the interest
        return super.getBalance()*(super.getInterestRate()/100);
    }
    
    
}
