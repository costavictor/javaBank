package clients;

import financial.Account;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private String firstName, lastName, email, streetAddress, postalCode, phoneNumber, gender, country, province, city;
    private Date birthDate;
    private ArrayList<Account> custAccount = new ArrayList<>();
    
    // every get and set methods are used when you wanna request a data in any moment in the class
    
    public Customer(String firstName, String lastName, String email, String streetAddress,String postalCode, String phoneNumber, 
            String gender, String country, String province, String city, int year, int month, int day)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.streetAddress = streetAddress;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.country = country;
        this.province = province;
        this.city = city;
        birthDate = new Date(year, month-1, day);
    
    }
    
    // basic constructor
    public Customer(String firstName, String lastName, String streetAddress,String postalCode, 
            String gender, String country, String province, String city, int year, int month, int day)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.postalCode = postalCode;
        this.gender = gender;
        this.country = country;
        this.province = province;
        this.city = city;
        birthDate = new Date(year, month-1, day);
    
    }
    
    // overloaded constructor
    public Customer(String firstName, String lastName, String email, String streetAddress,String postalCode, String phoneNumber, 
            String gender, String country, String province, String city, int year, int month, int day, double balance)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.streetAddress = streetAddress;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.country = country;
        this.province = province;
        this.city = city;
        birthDate = new Date(year, month-1, day);
        
    }
    
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName; 
    }
    
    public Date getBirthDate()
    {
        return birthDate;
    }
    
    public void setBirthDate(int year, int month, int day)
    {
        this.birthDate = birthDate;
    }
    
    
    
    // @override another Java Object, in this case, toString()
    @Override
    public String toString()
    {
        String newString = this.firstName + " " + this.lastName +" " + this.birthDate;
        return newString;
    }
    
    
}
