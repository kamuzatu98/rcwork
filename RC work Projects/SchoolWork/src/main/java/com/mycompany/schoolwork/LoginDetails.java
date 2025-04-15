/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schoolwork;

/**
 *
 * @author jerem
 */
public class LoginDetails {
    //Attributes
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String RSAphoneNumber;
    
     //Constructor
    public LoginDetails(String firstName, String lastName, String userName, String password, String RSAphoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.RSAphoneNumber = RSAphoneNumber;
        
    }
    //Setter and Getter methods
    public String getfirstName(){
        return firstName;
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public String getuserName(){
        return userName;
    }
    public void setuserName(String userName){
        this.userName = userName;
    }
    public boolean checkuserNameFormat(){
        return userName.contains("_")&&userName.length()<=9; 
    }
    //Void method
    public void displayFullname(){
        System.out.println(firstName+""+lastName);
    }
    public String getRSAphoneNumber(){
        return RSAphoneNumber;
    }
    public void setRSAphoneNumber(String RSAphoneNumber){
        this.RSAphoneNumber = RSAphoneNumber;
        
    }
   
            
            
          
                    
                    
        }
    
  
        
   

