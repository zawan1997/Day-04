package myapp.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mapmain{

    public static void main(String[] args){

        // Convert into a list 
        //BankAccount fred  = new BankAccount("fred");
        //BankAccount ted  = new BankAccount("ted");
        //BankAccount bob  = new BankAccount("bob");

        List<String> names = new LinkedList<>();
        names.add("fred");
        names.add("ted");
        names.add("bob");

        Map<String, BankAccount> accts = new HashMap<>();

        for (String n:names){
            BankAccount acct = new BankAccount(n);
            accts.put(acct.getAccountd(), acct);
        }

        //Create a Simple Map. Create a list of names instead of one by one
        //accts.put(fred.getAccountd(), fred);
        //accts.put(ted.getAccountd(), ted);
        //accts.put(bob.getAccountd(), bob);
        //accts.put(names.getAccountd()), 

        System.out.printf("size: %d\n", accts.size());
        System.out.printf("has fred: %b\n", accts.containsKey(fred.getAccountd()));

        BankAccount acct;

        Set<String> keys =accts.keySet();
        Collection<BankAccount> values = accts.values();

        for(String acctId: keys) {
            acct =accts.get(acctId);
            System.out.printf("acctid = %s, name = %s\n ", acctId, acct.getName());

        }
    }
}