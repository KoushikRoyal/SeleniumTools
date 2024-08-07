package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.gmail.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("2100031449cseh@gmail.com");
        Thread.sleep(2000);
        if(driver.getTitle().equalsIgnoreCase("gmail")){
            System.out.println("Test successful");
        }
        else{
             System.out.println("Test failed");
        }
        driver.quit();
    }
}