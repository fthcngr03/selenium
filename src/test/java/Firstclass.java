import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstclass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/java/Firstclass.java");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
    }

}
