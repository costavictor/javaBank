package financial;

import general.ServiceClass;

public class Credit extends Account{
    
    private double creditLimit;
    
    public Credit(double balance, double interestRate, int year, int month, int day, double creditLimit){
        
        super(balance, interestRate, year, month, day);
        
        this.creditLimit = creditLimit;
    }
    @Override
    public double getCreditLimit(){
        return this.creditLimit;
    }
    
    public void setCreditLimit(){
        this.creditLimit = creditLimit;
    }
    
    @Override
    public double calculateInterest(){
        //write logic to calculate the interest
        return 0.0;
    }
    
}
