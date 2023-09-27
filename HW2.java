package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HW2 {
    public static void main(String[] args) {
        WebDriver HomeWorkDriver = new EdgeDriver();
        HomeWorkDriver.get("http://35.175.58.98/Xpath.php");
        HomeWorkDriver.manage().window().maximize();
        WebElement field3=HomeWorkDriver.findElement(By.xpath("//input[@name='customField1' and @data-detail='one']"));
        field3.sendKeys("Soccer");
        WebElement field4=HomeWorkDriver.findElement(By.xpath("//input[@name='customField1' and @data-detail='two']"));
        field4.sendKeys("Lion");
    }
}
