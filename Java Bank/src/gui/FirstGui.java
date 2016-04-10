package gui;

import general.logins;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
//events library
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JComponent;


public class FirstGui extends JFrame implements ActionListener{
    
    //panels
    public JPanel loginPanel, mainPanel;
    //labels
    private JLabel usernameLabel, passwordLabel;
    private JLabel firstNameLabel, lastNameLabel, emailLabel, streetAddressLabel, postalCodeLabel, phoneNumberLabel, genderLabel, countryLabel, provinceLabel, cityLabel, bdayLabel;
    //inputs
    private JTextField username, firstName, lastName, email, streetAddress, postalCode, phoneNumber, gender, country, province, city, bday;
    private JPasswordField password;
    private JButton submit;
    
    private ArrayList<String> validUsers = new ArrayList<>();
    private ArrayList<String> validPasswords = new ArrayList<>();
  
        
    public FirstGui(){
            //Login Panel
            setTitle("Welcome to Java Bank!");
            
            
            //define size
            setSize(250, 200);
            
            //set close application
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //calling the method that builds loginPanel
            loginPanel();
          
            add(loginPanel);
            
                           
            
            //main panel
            setTitle("Java Bank");
            
            //define size
            setSize(450, 300);
            
            //set close application
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //calling the method that builds loginPanel
            
    }
    
    public void loginPanel(){
        //create the panel
        
        
        loginPanel = new JPanel();
        
        
        //requesting information
        this.usernameLabel = new JLabel("Username:");
        this.passwordLabel = new JLabel("Password:");
        //text boxes
        this.username = new JTextField(10);
        this.password = new JPasswordField(10);
        
        this.submit = new JButton("Enter");
        submit.addActionListener (this);
        
        loginPanel.add(usernameLabel);
        loginPanel.add(username);
        
        loginPanel.add(passwordLabel);
        loginPanel.add(password);
        
        //action for submit button
        loginPanel.add(submit);      
        
        
        
    }
    //hide login panel method
    private void hideLoginPanel()
    {
        loginPanel.setVisible(false);
    }
  private void showMainPanel() {
       mainPanel.setVisible(true);
    }
    public void mainPanel(){
        
        mainPanel = new JPanel();
        
        //tabs for menu
        JTabbedPane menu = new JTabbedPane();
  
        //requesting information
        this.firstNameLabel = new JLabel("Firs Name:");
        this.lastNameLabel = new JLabel("Last Name:");
        this.emailLabel = new JLabel("Email:");
        this.streetAddressLabel = new JLabel("Street Address:");
        this.postalCodeLabel = new JLabel("Postal Code:");
        this.phoneNumberLabel = new JLabel("Phone Number:");
        this.genderLabel = new JLabel("Gender:");
        this.countryLabel = new JLabel("Country:");
        this.provinceLabel = new JLabel("Province:");
        this.cityLabel = new JLabel("City:");
        this.bdayLabel = new JLabel("Birthday:");
        
        //text boxes
        //firstName, lastName, email, streetAddress, postalCode, phoneNumber, gender, country, province, city
        this.firstName = new JTextField(20);
        this.lastName = new JTextField(20);
        this.email = new JTextField(20);
        this.streetAddress = new JTextField(30);
        this.postalCode = new JTextField(6);
        this.phoneNumber = new JTextField(10);
        this.gender = new JTextField(6);
        this.country = new JTextField(20);
        this.province = new JTextField(2);
        this.city = new JTextField(20);
        this.bday = new JTextField(8);        
        
        this.submit = new JButton("Enter");
        
        //menu.addTab("Create Account", null, createAccountTab(), "New Java Bank Account");
//        menu.setMnemonicAt(0, KeyEvent.VK_1);
        mainPanel.add(firstNameLabel);
        mainPanel.add(firstName);
        
        mainPanel.add(lastNameLabel);
        mainPanel.add(lastName);
        
        mainPanel.add(emailLabel);
        mainPanel.add(email);
        
        mainPanel.add(phoneNumberLabel);
        mainPanel.add(phoneNumber);
        
        mainPanel.add(genderLabel);
        mainPanel.add(gender);
        
        mainPanel.add(countryLabel);
        mainPanel.add(country);
        
        mainPanel.add(provinceLabel);
        mainPanel.add(province);
        
        mainPanel.add(cityLabel);
        mainPanel.add(city);
        
        mainPanel.add(bdayLabel);
        mainPanel.add(bday);
        
        mainPanel.add(submit);
        //action for button
        submit.addActionListener (this);
        mainPanel.setVisible(true);
        }
    
    
    
  

   /* @Override
    public Component add(String string, Component cmpnt) {
        return super.add(string, cmpnt); //To change body of generated methods, choose Tools | Templates.
    }*/
 
  
    //overide method for actions
    public void actionPerformed (ActionEvent e)
    {
        if (e.getActionCommand ().equalsIgnoreCase ("Enter")){
           try{
           //getting input from user
           String username = this.username.getText();
           
            //password -> char to string
           char[] charPassword = this.password.getPassword();
           String password = new String(charPassword);
            
           //loop to check logins
           for (int i = 0; i < validUsers.size(); i++) {
                if (validUsers.get(i).equals(username) && validPasswords.get(i).equals(password)) {
                    JOptionPane.showMessageDialog(null, "Welcome to Java Bank!");
                }
                else
                    JOptionPane.showMessageDialog (null, "Enter the correct Password", "Invalid Password",
                             JOptionPane.ERROR_MESSAGE);
                }
            
            }
        
        catch(NullPointerException error){
            if(password == null){
                JOptionPane.showMessageDialog (null, "Where is your password?", "?",
                    JOptionPane.QUESTION_MESSAGE);
            }
            
            if(username == null){
                JOptionPane.showMessageDialog (null, "Where is your username?", "?",
                    JOptionPane.QUESTION_MESSAGE);
            }
        }
            
        }
            //enter button
         
       
            /*for (int i=0; i<3; i++)
            {
        String validPassword = "";
                if(username.equals(logins[i][0]))
                {
                    validPassword = logins[i][1];
                    if(password.equals(validPassword))
                    { 
                        // hide login panel
                         hideLoginPanel();
                         showMainPanel();
                    // show main panel
                         break;
                    }
                    else
                    {
                         JOptionPane.showMessageDialog (null, "Enter the correct Password", "Invalid Password",
                             JOptionPane.ERROR_MESSAGE);
                        
                    }
                
                }
                if(i==2)
                {
                JOptionPane.showMessageDialog (null, "Enter the correct user name", "Invalid User",
            JOptionPane.ERROR_MESSAGE);      
            }
            }
}}
             */
                
            
    }
    
    private void logins(){
        validUsers = new ArrayList();
        validPasswords = new ArrayList();

        validUsers.add("victor");
        validUsers.add("user2");
        validUsers.add("user3");
        validUsers.add("user4");
        validUsers.add("user5");

        validPasswords.add("victor");
        validPasswords.add("password2");
        validPasswords.add("password3");
        validPasswords.add("password4");
        validPasswords.add("password5");
}

    public ArrayList<String> getValidUsers(){
        return validUsers;
    }

    public ArrayList<String> getValidPasswords(){
        return validPasswords;
    }
}





          
    //
    
    

