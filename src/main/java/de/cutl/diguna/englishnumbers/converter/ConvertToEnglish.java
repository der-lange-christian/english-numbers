/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cutl.diguna.englishnumbers.converter;

/**
 *
 * @author chris
 */
public class ConvertToEnglish {

    public String convert(int i) {
        if (i < 20) {
            return convertBelow20(i);
        }
        if (i < 100) {
            return convertBelow100(i);
        }
        if (i < 1000) {
            return convertBelow1000(i);
        }
        if (i < 1000000) {
            return convertBelowOneMillion(i);
        }
        return "";
    }
    
    private String convertBelow20(int i) {
        switch (i) {
            case 0: return "";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            case 20: return "twenty";
        }
        return "";
    }
    
    private String convertBelow100(int i) {
        String value = "";
        int decades = i / 10;
        int rest = i % 10;
        if (decades *10 < 20) {
            return convertBelow20(i);
        }
        
        switch (decades * 10) {
            case 20: value = "twenty";  break;
            case 30: value = "thirty";  break;
            case 40: value = "forty";   break;
            case 50: value = "fifty";   break;
            case 60: value = "sixty";   break;
            case 70: value = "seventy"; break;
            case 80: value = "eighty";  break;
            case 90: value = "ninety";  break;
        }
        
        String lastValue = convertBelow20(rest);
        if (lastValue.isEmpty()) {
            return value;
        }
        return value + " " + convertBelow20(rest);
    }

    private String convertBelow1000(int i) {
        int hundrets = i / 100;
        int rest = i % 100;
        
        String hundretsInWords = convertBelow20(hundrets);
        
        String value = "";
        if (!hundretsInWords.isEmpty()) {
            value += hundretsInWords + " hundred ";
        }
        
        value += convertBelow100(rest);
        return value;
    }

    private String convertBelowOneMillion(int i) {
        int millions = i / 1000;
        int rest = i % 1000;
        
        String millionInWords = convertBelow1000(millions);
        String restInWords = convertBelow1000(rest);
        
        String value = "";
        
        if (!millionInWords.isEmpty()) {
            value += millionInWords + " thousand";
        }
        if (!restInWords.isEmpty()) {
            value += " " + restInWords;
        }
        
        return value;
    }
    
}
