package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_Tests {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mmsol\\OneDrive\\Masaüstü\\selenium dependencies\\drivers\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.com");
       driver.manage().window().maximize();

    }
}
