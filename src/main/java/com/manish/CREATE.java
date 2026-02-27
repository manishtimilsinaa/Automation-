package com.manish;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CREATE {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Duration timeout = Duration.ofSeconds(10);
        driver.manage().timeouts().implicitlyWait(timeout);
        
        //log in to info vault
       driver.get("http://192.168.1.242:8403/sys");

        // String title=driver.getTitle();
        // if(title.equalsIgnoreCase("Info Vault"))
        // {
        //     System.out.println("Title is correct");
        // }
        // else
        // {
        //     System.out.println("Title is incorrect");
        // }
// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("email")).sendKeys("developer_mi+ivpm@yonefu.info");
driver.findElement(By.id("password")).sendKeys("1qaz@WSX3EdC");
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/form/div[3]/div[2]/div/button")).submit();

driver.get("http://192.168.1.242:8403/appadmin/projects/create");
driver.findElement(By.id("project_name")).sendKeys("TestProject Automation1");
     
// 🔹 Navigate to Create Project

Select dropdown=new Select(driver.findElement(By.id("project_type")));
dropdown.selectByValue("2");

Select dropdown1=new Select(driver.findElement(By.id("pm_id")));
dropdown1.selectByVisibleText("Manish Timalsina");

Select dropdown2=new Select(driver.findElement(By.id("tl_id")));
dropdown2.selectByVisibleText("TL Emp");

driver.findElement(By.id("tech_details")).sendKeys("this is just a automation test");

WebElement dateField = driver.findElement(By.id("start_date"));
dateField.clear();
dateField.sendKeys("2026-02-25");
dateField = driver.findElement(By.id("end_date"));
dateField.clear();
dateField.sendKeys("2026-03-25");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    try {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("addMore"))).click();
    } catch (Exception e) {
        WebElement addMoreBtn = driver.findElement(By.id("addMore"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addMoreBtn);
        try {
            addMoreBtn.click();
        } catch (Exception ex) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addMoreBtn);
        }
    }

    // wait for the newly added fields to appear
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("multidata_1_employee_id")));


Select multi = new Select(driver.findElement(By.id("multidata_0_employee_id")));
multi.selectByValue("11"); 

dateField = driver.findElement(By.id("multidata_0_assigned_date"));
dateField.clear();
dateField.sendKeys("2026-02-25");

dateField = driver.findElement(By.id("multidata_0_released_date"));      
dateField.clear();
dateField.sendKeys("2026-03-29");



Select multi2 = new Select(driver.findElement(By.id("multidata_1_employee_id")));
multi2.selectByValue("7");


dateField = driver.findElement(By.id("multidata_1_assigned_date"));
dateField.clear();
dateField.sendKeys("2026-02-25");

dateField = driver.findElement(By.id("multidata_1_released_date"));      
dateField.clear();
dateField.sendKeys("2026-03-29");


// driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/form/div[2]/div/div/div/div/span[1]")).click();


driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/form/div[2]/button")).click();
driver.manage().window().maximize();

        // Keep browser open for 5 seconds before closing
        // Thread.sleep(5000);

       
    }
}
