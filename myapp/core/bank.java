package myapp.core;

import java.util.*;

public class bank{
    private String name;
    private String Accnum;
    private Float balance;
    private List<String> transactions = new LinkedList<String>();
    private Boolean status;
    private Integer creation;
    private Integer deletion;
    

       //constructor default
      public bank(){

        
        
        }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAccnum() {
        return Accnum;
    }


    public void setAccnum(String accnum) {
        Accnum = accnum;
    }


    public Float getBalance() {
        return balance;
    }


    public void setBalance(Float balance) {
        this.balance = balance;
    }


    public List<String> getTransactions() {
        return transactions;
    }


    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }


    public Boolean getStatus() {
        return status;
    }


    public void setStatus(Boolean status) {
        this.status = status;
    }


    public Integer getCreation() {
        return creation;
    }


    public void setCreation(Integer creation) {
        this.creation = creation;
    }


    public Integer getDeletion() {
        return deletion;
    }


    public void setDeletion(Integer deletion) {
        this.deletion = deletion;
    }

     // METHODS
     public Integer getdeposit(Integer money)  {

        return money++;

    
        
        
        
         }


































}