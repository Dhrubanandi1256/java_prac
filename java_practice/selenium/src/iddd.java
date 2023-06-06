import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class iddd {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","E:\\sel1\\driver\\msedgedriver.exe");
        WebDriver driver =new EdgeDriver();
        driver.get("https://accounts.google.com/");
       WebElement email= driver.findElement(By.id("identifierId"));//output is a webelement
       email.sendKeys("dr@gmail.com");
    }
}
