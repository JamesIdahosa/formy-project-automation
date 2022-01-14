import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.*;

public class Form {
    public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\Desktop\\Osasere Documents\\browserdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        
        WebElement inputfname = driver.findElement(By.cssSelector("input[id='first-name']"));
        inputfname.sendKeys("James");
        
        WebElement inputlname = driver.findElement(By.cssSelector("input[id='last-name']"));
        inputlname.sendKeys("Ida");
        
        WebElement inputjb = driver.findElement(By.cssSelector("input[id='job-title']"));
        inputjb.sendKeys("Game dev");
        
        
        WebElement levelofeducation = driver.findElement(By.cssSelector("input[id='radio-button-1']"));
        levelofeducation.click();
        
        
        WebElement sexuality = driver.findElement(By.cssSelector("input[id='checkbox-1']"));
        sexuality.click();
        
        
        WebElement experience = driver.findElement(By.cssSelector("select[id='select-menu']"));
        experience.click();
        
        WebDriverWait wait = new  WebDriverWait(driver,10);
        
        WebElement experience_selection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[id='select-menu'] option[value='2']")));  
        experience_selection.click();
        

        WebElement datepicker = driver.findElement(By.cssSelector("input[id='datepicker']"));
        datepicker.sendKeys("01/13/2022");
        
        
        WebElement submit = driver.findElement(By.cssSelector("a[class='btn btn-lg btn-primary']"));
        submit.click();
        
        WebDriverWait wait2 = new  WebDriverWait(driver,10);
        WebElement alert = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
        
        String alerttext = alert.getText();
        assertEquals("The form was successfully submitted!", alerttext);

        
        //driver.quit();
    }
}
