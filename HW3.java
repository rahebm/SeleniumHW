package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        // Fill in the first name field
        WebElement firstNameField = driver.findElement(By.xpath("//input[@id='userName']"));
        firstNameField.sendKeys("Mohammad Raheb");
        // Fill in the email address field
        WebElement emailAddressField = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailAddressField.sendKeys("mohr@gmail.com");
        // Fill in the current address field
        WebElement currentAddressField = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddressField.sendKeys("123 Ave rd");
        // Fill in the permanent address field
        WebElement permanentAddressField = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddressField.sendKeys("455 East rd");
        // Click the submit button
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
    }
}

