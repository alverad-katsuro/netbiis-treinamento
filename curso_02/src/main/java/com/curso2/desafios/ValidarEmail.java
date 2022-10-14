package com.curso2.desafios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class ValidarEmail {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog(null, "Digite um e-mail");
        JOptionPane.showMessageDialog(null, "O email é valido? " + validarEmail(email));
    }

    
    /** 
     * @param email
     * @return boolean
     */
    public static boolean validarEmail(String email){
        Pattern p = Pattern.compile("^[a-z0-9A-Z+_.-]+@[a-z0-9A-Z+_.-]+$");
        Matcher m = p.matcher(email);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
