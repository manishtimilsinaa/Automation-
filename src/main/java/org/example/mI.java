package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class mI {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/home/manishtimilisina/Downloads/chromedriver-linux64/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://192.168.1.242:8305/login");
            driver.findElement(By.name("email")).sendKeys("developer_mi+tpsjakarta@yonefu.info");
            driver.findElement(By.name("password")).sendKeys("7wAEPo3dqnGrWz");
            driver.findElement(By.cssSelector("button.auth-btn.btn.btn-primary.btn-block.mb-3")).click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("property_name")));


            // Fill property name
            driver.findElement(By.name("property_name")).sendKeys("Sunrise Apartments");

            // Fill property name locale
            driver.findElement(By.name("property_name_locale")).sendKeys("サンライズ アパートメント");

            // Leave slug empty to auto-generate

            // Meta fields
            driver.findElement(By.name("meta_title")).sendKeys("Sunrise Apartments in Kathmandu");
            driver.findElement(By.name("meta_keyword")).sendKeys("apartments, kathmandu, rent");
            driver.findElement(By.name("meta_description")).sendKeys("Luxury apartments in central Kathmandu");

            // Property Type
            Select propertyType = new Select(driver.findElement(By.name("property_type")));
            propertyType.selectByVisibleText("Apartment");

            // Area
            Select area = new Select(driver.findElement(By.name("area")));
            area.selectByIndex(1); // Select first area option (customize this)

            // Google Map
            driver.findElement(By.name("google_map")).sendKeys("https://www.google.com/maps/embed?pb=!1m22!...");

            // Established year
            driver.findElement(By.name("established")).sendKeys("2020");

            // Floor Plan
            Select floorPlan = new Select(driver.findElement(By.name("floor_plan")));
            floorPlan.selectByVisibleText("2 ベッドルーム");

            // Property Tags
            driver.findElement(By.name("property_tags")).sendKeys("ジム, プール, 駐車場, CCTV / セキュリティ");

            // Room area min & max
            driver.findElement(By.name("room_area_min")).sendKeys("40");
            driver.findElement(By.name("room_area_max")).sendKeys("49");

            // Rent Estimate
            driver.findElement(By.name("rent_estimate")).sendKeys("USD 800 ~ USD 1,900");

            // Total No. Rooms
            driver.findElement(By.name("total_rooms")).sendKeys("100");

            // Info fields
            driver.findElement(By.name("information1")).sendKeys("Located near city center.");
            driver.findElement(By.name("information2")).sendKeys("Includes all modern amenities.");

            // Address
            driver.findElement(By.name("address")).sendKeys("Kabil Marg, Kathmandu 44600");

            // City Name
            driver.findElement(By.name("city_name")).sendKeys("Kathmandu");

            // File uploads (skip or use sendKeys with file path if required)
            // driver.findElement(By.name("incharge_image")).sendKeys("/path/to/image.jpg");
            // driver.findElement(By.name("property_image")).sendKeys("/path/to/property.jpg");

            // Submit (uncomment only if you're ready to test form submission)
            // driver.findElement(By.cssSelector("button[type='submit']")).click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // driver.quit(); // Uncomment to close the browser after execution
        }
    }
}
