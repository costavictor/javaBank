package clients;
import financial.Account;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class CustomerIC {
    
    private String firstName, lastName, email, streetAddres, postalCode, phoneNumber, gender, province, country, city;
    
    private Date birthDay;
    
    private ArrayList<Account> custAccount = new ArrayList<>();
    
    // default constructor
    
    public CustomerIC(String firstName, String lastName, String email, String streetAddres, String postalCode, String phoneNumber,
            String gender, String province, String country, String city, int year, int month, int day){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.streetAddres = streetAddres;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.province = province;
        this.country = country;
        this.city = city;
        this.birthDay = new Date(year, month-1, day);        
    }
    
    // overloaded constructor - meant to prepare for different situations 
    public CustomerIC(String firstName, String lastName, String email, String streetAddres, String postalCode, String phoneNumber,
            String gender, String province, String country, String city, int year, int month, int day, double balance){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.streetAddres = streetAddres;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.province = province;
        this.country = country;
        this.city = city;
        this.birthDay = new Date(year, month-1, day);  
        
        //create and add the account to the array list
        
        //Account tempAccount = new Account(balance);
        ///custAccount.add(tempAccount);   
        
        //custAccount.add(new Account(balance)); now class Account is abstract
    }
    public CustomerIC(String firstName, String lastName, String streetAddres, String postalCode, String gender, String province, String country,
                String city, int year, int month, int day){
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddres = streetAddres;
        this.postalCode = postalCode;
        this.gender = gender;
        this.province = province;
        this.country = country;
        this.city = city;
        this.birthDay = new Date(year, month-1, day); 
    }

}
