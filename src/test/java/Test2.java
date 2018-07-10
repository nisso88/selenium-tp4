import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    WebDriver driver;

    @Test
    public void test1()
    {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }




}
