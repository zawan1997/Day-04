package myapp.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Readermain {

    //java ReaderMain text file

    public static void main(String[] args) throws FileNotFoundException { 
        try{
        BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\coyot\\vttp2022\\day04\\exams.csv"));
        String s=("");
        
        //String[] row = s.split(",");
        while((s= read.readLine()) != null){
            s = s.replaceAll("[^a-zA-Z0-9]", "");
            //can also replace ("\"", "")
            for(int i = s.length()-1; i>=0; i--){
            }
            //new String("text").reverseIndexOf("s");

            //String str[] = s.split(",");
            //List<String> text = new ArrayList<String>();
            //text= Array.asList(str);
            if(s.contains("group A")){

            System.out.println(s);}

        }
        read.close();
    } catch(Exception ex){
        return;
    } 
    }
    
}
