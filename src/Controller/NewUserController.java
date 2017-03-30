/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.UserDAO;
import java.util.ArrayList;
import model.User;
import view.NewUserView;

/**
 *
 * @author Formation
 */
public class NewUserController {

    boolean isValid = true;
    String errorMessage = "";
    
    private UserDAO userDAO;
    
//------------------------------------------------------------------------------
    
    public NewUserController(UserDAO userDAO) {
       
        this.userDAO = userDAO;
    }

//------------------------------------------------------------------------------
    // create new user with informations
    
    public boolean CreateNewUser(NewUserView newUserView) {     
        
        User user = new User();
        
    
        String pseudo = newUserView.getPseudoTextField().getText();
        String password = newUserView.getPasswordTextField().getText();
        String firstname = newUserView.getFirstnameTextField().getText();
        String lastname = newUserView.getLastnameTextField().getText();
        String mail = newUserView.getMailTextField().getText();
        
        user.setPseudo(pseudo);
        user.setLastname(lastname);
        user.setFirstname(firstname);
        user.setPassword(password);
        user.setMail(mail);
     
    
    // if fields are empty
       if( pseudo.equals("") || password.equals("") ||firstname.equals("") || 
           lastname.equals("") || mail.equals("")) {
        
       }else {
     
    // else create user       
           user =  userDAO.create(user);
       }
        boolean result = this.userDAO.isValid(user);
     
    return result;     
  
}
//------------------------------------------------------------------------------    
   
}
