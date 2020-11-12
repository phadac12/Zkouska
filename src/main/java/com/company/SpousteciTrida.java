package com.company;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class SpousteciTrida {
    WebDriver browser;
    



    public static void main(String[] args) {
        System.out.println("Zdravim, pozemstani! Zavedte me ke svemu vudci");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Chris\\Downloads\\czechitas-selenium\\czechitas-selenium\\seleniumdriver\\geckodriver.exe");
        WebDriver browser = new FirefoxDriver();
        browser.quit();


    }

    @Test
    public void NovyTest(){}

}
