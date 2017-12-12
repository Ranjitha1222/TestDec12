package com.pkg;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Test {

	public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello Motto");
        //File pathToBinary = new File("C:\\Users\\VB00535799\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
        //FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
       // FirefoxProfile firefoxProfile = new FirefoxProfile();
        //WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);  
       //driver.get("https://google.com");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VB00535799\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.quit();
	}

}
