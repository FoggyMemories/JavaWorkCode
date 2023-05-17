package com.qian.school_2023.May.exercise05_17.work.p169;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyRead {
    public static void getProperty(){
        Properties prop = new Properties();
        try{
            FileInputStream in = new FileInputStream("C:\\Users\\Z790M\\Documents\\Files\\Java\\JavaWorkCode\\Work\\src\\com\\qian\\school_2023\\May\\exercise05_17\\work\\ch18\\drivers.properties");
            prop.load(in);
            String driver = prop.getProperty("drivers");
            String url = prop.getProperty("url");
            String userName = prop.getProperty("user");
            String password = prop.getProperty("password");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        getProperty();
    }
}
