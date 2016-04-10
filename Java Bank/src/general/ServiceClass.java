package general;

import java.util.Scanner;

public class ServiceClass {
    
    private static int accountNum = 1000;
    
    public static int getAccountNumber(){
        return accountNum++; 
    }
    
    public static void mainMessage(){
        
        int input = 0;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Please select one of the following:");
            
            System.out.println("1- Account Management"
                    + "\n2- Customer Management"
                    + "\n3- Exit");
        
            input = read.nextInt(); 
    }
    
    public static void accountMessage(){
        System.out.println("Please select one of the following");
                    System.out.println("1-Create new Account"
                            + "\n2- Lookup existing Account"
                            + "\n3- Return to the main menu");
    }
    
    public static void customerMessage(){
      
        
    }
    
    public static void invalidInputMessage(){
        System.out.println("You entered a wrong input");
    }
    
    
}
