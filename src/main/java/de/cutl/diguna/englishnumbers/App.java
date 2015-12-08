/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cutl.diguna.englishnumbers;

import de.cutl.diguna.englishnumbers.converter.ConvertToEnglish;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author chris
 */
public class App {
    
    public static void main(String[] args) throws IOException {
        ConvertToEnglish cte = new ConvertToEnglish();
        
        InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("");
        System.out.println("Just write numbers and finish with Enter");
        System.out.println("working up to 999.999 and without decimals");
        System.out.println("");
        System.out.println("Exit with empty input (just press Enter)");
        System.out.println("");
        
        String input = br.readLine();
        while (!input.isEmpty()) {
            // remove . / ,
            input = input.replaceAll("\\.", "");
            input = input.replaceAll("\\,", "");
            
            
            try {
                int integer = Integer.parseInt(input);
                String value = cte.convert(integer);
                
                if (integer >= 1000000) {
                    System.out.println(" ! " + integer + " is to high (has to be below 1.000.000)");
                } else {
                    System.out.println(" -> " + value);
                }
            } catch (Exception e) {
                System.out.println(" ! sorry this was not a valid number");
            }
            
            
            
            input = br.readLine();
        }
    }
    
}
