import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateMatesel {


        public static void main (String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.datamateinc.com");

            driver.manage().window().maximize();

            driver.findElement(By.linkText("Training")).click();

            driver.findElement(By.partialLinkText("Database")).click();

            driver.findElement(By.cssSelector("#default-btn-86dfb65d5a95023ba5557de2b61b07ef > span")).click();

            driver.findElement(By.id("wpforms-3337-field_19")).sendKeys("Mr");

            driver.findElement(By.id("wpforms-3337-field_0")).sendKeys("Sakkie");

            driver.findElement(By.id("wpforms-3337-field_0-last")).sendKeys("Malan");

            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div/section[3]/div/div[1]/div/div/div/div/form/div[1]/div[8]/div/div[2]")).sendKeys("South Africa");

            driver.quit();


        }
    }
