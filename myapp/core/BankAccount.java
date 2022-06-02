package myapp.core;

import java.util.UUID;

public class BankAccount {

    private String accountd = UUID.randomUUID().toString().substring(0, 8);
    private String name;


// Constructor
    public BankAccount(String name){
        this.name = name;
    }


    public String getAccountd() {
        return accountd;
    }


    public void setAccountd(String accountd) {
        this.accountd = accountd;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    
    public static void main(String[] args){
        
    }
    
}
