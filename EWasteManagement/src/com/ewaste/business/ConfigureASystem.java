package com.ewaste.business;

import com.ewaste.business.person.Person;
import com.ewaste.business.role.SystemAdminRole;
import com.ewaste.business.useraccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Person employee = system.getPersonDirectory().createEmployee();
        employee.setFirstName("SYSADMIN");
        employee.setLastName("ADMIN");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
