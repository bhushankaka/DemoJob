package com.example.MavenDemo;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String currentdir = System.getProperty("user.dir") + File.separator + "lib"
                + File.separator;
        System.setProperty("webdriver.chrome.driver", currentdir+"chromedriver");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.diffchecker.com/");
        System.out.println("1111111111");
        System.out.println("2222222222222");
        
        
        driver.close();
    }
    
    
    
    
}
