package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/manishtimilisina/Downloads/chromedriver-linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://miracleinterface.com.np/");
        String act_title=driver.getTitle();
        if (act_title.equals("AI Agent Adoption Platform | anydone")){
            System.out.println("passed");
        }
        else {
            System.out.println("failed");
        }

//        driver.findElement(By.name("q")).sendKeys("mac");
      //  boolean tet=driver.findElement(By.id("q")).isDisplayed();
      //  System.out.println(tet);
        //driver.findElement(By.linkText("Services")).click();
        List<WebElement> footerlinks=driver.findElements(By.tagName("a"));
        System.out.println("size of links are "+footerlinks.size());
List<WebElement> images=driver.findElements(By.tagName("img"));
System.out.println("size of images are "+images.size());
        driver.findElement(By.linkText("Contact")).click();
        Thread.sleep(3000);
//driver.findElement(By.cssSelector("#hero")).isDisplayed();
        driver.findElement(By.cssSelector(".form-control.w-100.form-control")).sendKeys("manish");
        driver.manage().window().maximize();
      Thread.sleep(3000);
      driver.close();

    }
}