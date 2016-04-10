package general;

import java.util.ArrayList;
import clients.Customer;
import financial.Account;
import financial.CheckingAccount;
import financial.Credit;
import financial.Savings;
import gui.FirstGui;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
   
    public static void main(String []args){
         
      
        
      
 
        
        
       // Customer myCustomer = new Customer("Victor", "Costa", "victorcosta@gmail.com", "341 Duckworth St E", 
         //       "L4M 3X6", "705 279 4303", "Male", "Canada", "ON", "Barrie", 97, 06, 22);

        
       // Account creditAcct = new Credit(100, 0.5, 2016, 4, 13, 3000);
        //Account savingsAcct = new Savings(100, 0.8, 2016, 4, 13);
        
        //ArrayList<Account> myAcctList = new ArrayList<>();                    
        
        //menu driven do while loop
            
            //calling the method that builds loginPanel
            
         
        FirstGui fGUI = new FirstGui();
        fGUI.loginPanel();
        fGUI.setSize(450, 300);
        fGUI.setTitle("Java Bank");
        fGUI.setVisible(true);
        fGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fGUI.add(fGUI.loginPanel);
        fGUI.mainPanel();
        fGUI.add(fGUI.mainPanel);
        
        
        /*  int acctInput = 0;
        boolean acctKeepGoing = true;
        Scanner userInput = new Scanner(System.in);
        do{//
        boolean acctFlag = true;
        double balance = 0.0, overDraftLimit = 0.0, interestRate = 0.0;
        int year = 0, month = 0, day = 0;
        if(acctInput == 1){
        do{
        System.out.println("Please enter account balance: ");
        balance = acctRead.nextDouble();
        if(balance < 100.0)
        throw new ArithmeticException();
        acctFlag = false;
        while(acctFlag);
        do{
        System.out.println("Please enter the overdraft limit: ");
        overDraftLimit = acctRead.nextDouble();
        if(balance < 100.0)
        throw new ArithmeticException();
        acctFlag = false;
        }
        while(acctFlag);
        System.out.println("Please enter the interest rate: ");
        interestRate = acctRead.nextDouble();
        System.out.println("Please enter the year: ");
        year = acctRead.nextInt();
        System.out.println("Please enter the month: ");
        month = acctRead.nextInt();
        System.out.println("Please enter the day: ");
        day = acctRead.nextInt();
        //add the account to the arrayList
        myAcctList.add(new CheckingAccount(balance, year, month, day, overDraftLimit, interestRate));
        }
        while(acctKeepGoing);
        }
        else if(input == 2){// customer management
        }
        else if(input == 3){
        keepGoing = false;
        }
        else{
        ServiceClass.invalidInputMessage();
        }
        }
        while(keepGoing);
        /*private static int readInt() throws InputMismatchException{
        Scanner read = new Scanner(System.in);
        return read.nextInt();
        }*/
            
        
        }
        
        
        

}

    