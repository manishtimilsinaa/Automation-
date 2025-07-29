package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class at {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();`
        driver.get("http://192.168.1.242:8360/contact");

        driver.findElement(By.name("from_name")).sendKeys("manishtimilsina");
        driver.findElement(By.name("from_email")).sendKeys("manish_mi@yonefu.info");
        driver.findElement(By.name("subject")).sendKeys("About the miracle interface");
        driver.findElement(By.name("message_body")).sendKeys(
                "Have questions or need assistance? Reach out to us anytime via email, phone, or our contact form, and we will get back to you as soon as possible."
        );

        // Wait until the Send Message button is clickable and click
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn-contact[type='submit']"))).click();

        // Optional: driver.quit();
    }
}
