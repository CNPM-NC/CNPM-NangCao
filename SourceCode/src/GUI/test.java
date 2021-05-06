/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tat Gia Vi
 */
public class test {
    public boolean test(String a){
        Pattern kitudb=Pattern.compile("[~!@#$%^&*)(-=/*+?<>;:']");
        Matcher ktdb=kitudb.matcher(a);
        if(ktdb.find()){
            return false;
        }
        else{
        for(char c:a.toCharArray()){
            if(Character.isLetter(c)){
               return false;
            }
        }
        }
        return true;
    }
    public void main(String[] args){
       test("0123456789");
    }
}
