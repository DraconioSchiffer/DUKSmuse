/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlib;

/**
 *
 * @author Swapnil
 */
public class UserClass {
    
     private String user_name,email;
    //private int id;
    UserClass(String user_name,String email)
    {
        this.user_name=user_name;
        this.email=email;
        
    }
    
    public String getUser_Name()
    {
        return user_name;
    }
    
    public String getemail()
    {
        return email;
    }
    
}
