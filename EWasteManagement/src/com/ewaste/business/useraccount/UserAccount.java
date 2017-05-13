/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.useraccount;

import com.ewaste.business.order.Orders;
import com.ewaste.business.person.Person;
import com.ewaste.business.role.Role;
import com.ewaste.business.workqueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
   private String password;
   private Person person;
   private Role role;
   private WorkQueue workQueue;
   private Orders orderList;
   
   

   public UserAccount() {
       workQueue = new WorkQueue();
       orderList = new Orders();
   }
   
   
   
   public String getUsername() {
       return username;
   }

   public void setUsername(String username) {
       this.username = username;
   }

   public String getPassword() {
       return password;
   }

   public void setPassword(String password) {
       this.password = password;
   }

   public Role getRole() {
       return role;
   }

   public void setPerson(Person person) {
       this.person = person;
   }

   public void setRole(Role role) {
       this.role = role;
   }

   public Person getPerson() {
       return person;
   }

   public WorkQueue getWorkQueue() {
       return workQueue;
   }

   public Orders getOrderList() {
       return orderList;
   }

   public void setOrderList(Orders orderList) {
       this.orderList = orderList;
   }
    
    @Override
    public String toString() {
        return username;
    }
    
}