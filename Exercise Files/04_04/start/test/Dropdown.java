import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chris\\Desktop\\Osasere Documents\\browserdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        
        WebElement dropdown = driver.findElement(By.cssSelector("button[id=dropdownMenuButton]"));
        dropdown.click();
        
        WebElement dropdowncontent = driver.findElement(By.cssSelector("div[class='dropdown-menu show'] a:nth-child(1)"));
        //or
        //WebElement dropdowncontent = driver.findElement(By.cssSelector("div[class='dropdown-menu show'] a[id='autocomplete']"));
        dropdowncontent.click();       
        
        
//        driver.quit();
    }
}
