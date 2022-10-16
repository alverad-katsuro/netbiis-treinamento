package com.curso3.unidade4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) throws InvalidPropertiesFormatException, FileNotFoundException, IOException {
        Properties sites = new Properties();
        sites.loadFromXML(new FileInputStream("curso_03/src/main/java/com/curso3/unidade4/site.xml"));
        System.out.println(sites.getProperty("2"));
    }
}
