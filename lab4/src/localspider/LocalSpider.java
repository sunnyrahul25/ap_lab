/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localspider;


import java.util.*;
import java.io.*;

/**
 *
 * @author sunnyrahul
 */
public class LocalSpider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("/home/sunnyrahul/advanced_programming");
        File[] listFiles = f.listFiles();
        System.out.println(f.isDirectory());
        Hashtable<String,String> hm=new Hashtable<String,String>();  
        directorycrawler(f,hm);
        System.out.println(hm.get("hello"));
        
        
        
    }
    public static void directorycrawler(File folder , Hashtable table )
    {
        if(!folder.isDirectory())
        {
            // throw an exception or not read it 
        }
        else
        {
            for (File file : folder.listFiles()) 
            {
                
                    try
                    {
                        if (file.isDirectory()) 
                        {
                            // crawl it , if it is a directory
                            directorycrawler(file,table);

                        } else 
                        {
                            // index the file path for file name
                            table.put(file.getName(),file.getParent());
                            // generate file name with full  path
                            String filename=file.getParent()+"/"+file.getName();
                           
                            // if it is a text file then read it and index each of its word
                            if(filename.endsWith(".txt"))
                            {
                                // read the file into string
                                String content = new Scanner(new File(filename)).useDelimiter("\\Z").next();
                                // each of the word in the file 
                                for (String word : content.split(" ") ) 
                                {
                                    // if is not already index than index it 
                                    if(!table.containsKey(word))
                                    {
                                        table.put(word,filename);
                                    }
                                    else
                                    {
                                        // if it is already exists in other file , then append it with this folder.
                                        String prevValue;
                                        prevValue = (String)table.get(word);
                                        String newValue = prevValue+"\n"+filename;
                                        table.put(word, newValue);
                                    }
                                }
                                
                            }
                            
                        }
                    
                    }catch(Exception e)
                    {
                        System.out.println("Exception thrown  :" + e);
                        
                    }
                
            }   
        }
    
    
    }
}