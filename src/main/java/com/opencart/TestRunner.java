package com.opencart;

import com.opencart.managers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.sql.Driver;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {

       WebDriver driver = DriverManager.getInstance().getDriver();
       driver.get("https://www.google.com/");

       String theNameOfTheFirstTab = driver.getWindowHandle();
       driver.switchTo().newWindow(WindowType.TAB);
       driver.get("https://www.diez.md");
       Thread.sleep(2000);
       driver.close();

       driver.switchTo().window(theNameOfTheFirstTab);
       driver.get("https://www.stiri.md");
       Thread.sleep(3000);
       driver.quit();






    }
}