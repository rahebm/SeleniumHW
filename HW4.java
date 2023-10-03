package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class HW4 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();
      List<WebElement> checkBoxes= driver.findElements(By.xpath("//input[@class='checkbox-field']"));
      for(WebElement checkBox:checkBoxes){
          String option=checkBox.getAttribute("value");
          if(option.equalsIgnoreCase("Checkbox-2")){
             boolean state = checkBox.isEnabled();
              System.out.println(state);
              if(!state){
                  WebElement enableBtn =driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
                  enableBtn.click();
                  boolean status2 = checkBox.isEnabled();
                  if(status2){
                      checkBox.click();
                     boolean isSelectedStatus = checkBox.isSelected();
                      System.out.println(isSelectedStatus);

                  }
              }


              }
          }

      }

    }

