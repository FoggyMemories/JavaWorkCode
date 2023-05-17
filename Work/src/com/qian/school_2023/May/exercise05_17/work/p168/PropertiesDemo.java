package com.qian.school_2023.May.exercise05_17.work.p168;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties proper = System.getProperties();

        Enumeration enum1 = proper.propertyNames();
        while (enum1.hasMoreElements()){
            String key = (String) enum1.nextElement();
            String pro = proper.getProperty(key);
            System.out.println(key + " = " + pro);
        }
    }
}
