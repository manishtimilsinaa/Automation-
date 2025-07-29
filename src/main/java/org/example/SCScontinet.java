package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCScontinet {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://192.168.1.242:8302/login");
        driver.findElement(By.name("email")).sendKeys("developer_mi+scs@yonefu.info");
        driver.findElement(By.name("password")).sendKeys("VmAW^3EpYr3S");
        WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/form/div[3]/div[2]/button"));
        loginBtn.click();

        driver.get("http://192.168.1.242:8302/cmsadmin/continent/create");
        driver.findElement(By.name("name_en")).sendKeys("Nep1aliihijii");
        driver.findElement(By.name("name_ja")).sendKeys("nihao");
        // Upload file using the hidden input[type='file']
        WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
        fileInput.sendKeys("/home/manishtimilisina/Pictures/image.jpg"); // Full absolute path

        WebElement createBtn= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/form/div/div/div[3]/button"));
        createBtn.click();

    }
}
