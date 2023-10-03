package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class HW5{

        public static void main(String[] args) {


            // Initialize the WebDriver
            WebDriver driver = new EdgeDriver();

            // Navigate to the URL
            String url = "http://35.175.58.98/basic-radiobutton-demo.php";
            driver.get(url);

            // Check if the "Female" radio button is displayed
            WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='Female']"));
            boolean isDisplayedBeforeClick = femaleRadioButton.isDisplayed();

            // Click on the "Show Button"
            WebElement showButton = driver.findElement(By.xpath("//button[contains(text(),'Show Button')]"));
            showButton.click();

            // Check again if the "Female" radio button is displayed or not
            boolean isDisplayedAfterClick = femaleRadioButton.isDisplayed();

            // Print the results of the checks to the console
            System.out.println("Is Female radio button displayed before click? " + isDisplayedBeforeClick);
            System.out.println("Is Female radio button displayed after click? " + isDisplayedAfterClick);

            // Close the browser
            driver.quit();
        }
    }


