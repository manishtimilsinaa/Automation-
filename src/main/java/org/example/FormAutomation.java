package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormAutomation {
    public static void main(String[] args) {
        // Set up ChromeDriver path

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            // Open the form page with basic auth
            driver.get("https://qss:Queserser5Gjj@319.stg.queserser-sea.com/web/course/apply");
            driver.manage().window().maximize();

            // First Choice Date
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("first_choice_date"))).sendKeys("2025/06/25");
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='first_choice_ampm'][value='am']"))).click();

            // Second Choice Date
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("second_choice_date"))).sendKeys("2025/06/26");
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='second_choice_ampm'][value='pm']"))).click();

            // Basic Course
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='basic_course'][value='A']"))).click();

            // Special Test (e.g., 1a and 4)
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='special_test'][value='1a']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='special_test'][value='4']"))).click();

            // Additional Requests
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("additional_test"))).sendKeys("None");

            // Name
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name_english"))).sendKeys("Manish Timilsina");

            // Gender
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='gender'][value='male']"))).click();

            // Date of Birth
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("dob"))).sendKeys("1999/07/28");

            // Membership No
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("membership_no"))).sendKeys("A123456");

            // Spouse or Father's Name
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("guardian_name"))).sendKeys("John Timilsina");

            // Company in Japan
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("company_japan"))).sendKeys("ABC Japan Ltd.");

            // Company in Singapore
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("company_sg"))).sendKeys("ABC SG Pte Ltd.");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("company_address"))).sendKeys("12 SG Business Park");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("company_postal"))).sendKeys("123456");

            // Home Address
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("home_address"))).sendKeys("456 Singapore St");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("home_postal"))).sendKeys("654321");

            // Mobile
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("mobile"))).sendKeys("91234567");

            // NRIC
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("nric"))).sendKeys("S1234567Z");

            // Birth Order
            WebElement birthOrderSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("birth_order")));
            new Select(birthOrderSelect).selectByValue("1");

            // Email
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys("manish@example.com");

            // Form of Payment
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='payment'][value='cash']"))).click();

            // Medical Report Destination
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='report_to'][value='company']"))).click();

            // Prior Visit
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='prior_visit'][value='yes']"))).click();

            // Agreement
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='agreement'][value='agree']"))).click();

            // Submit the form
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#application-form > div.form_btn_box > p.form_btn_b.btm10 > button"))).click();

            System.out.println("✅ Form filled and submitted successfully.");

            // Optional: keep browser open for a while to observe result
            Thread.sleep(10000);  // 10 seconds

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
