package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class C03_VerifyPageTitle {
    public static void main(String[] args) {
        //Yeni bir Class Olusturalim (VerifyTtitle)
        //Amazon ana sayfasina gidelim https://www.amazon.com/
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mmsol\\OneDrive\\Masaüstü\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        //Sayfa basliginin (title) "amazon" oldugunu dogrulayin. (verify)
        String expectedTitle = "amazon";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("title beklenen deger ile ayni, test PASS");
    }else{
        System.out.println("title beklenenenden farkli, test FAILED");
            System.out.println("aktuel title : "+ driver.getTitle());

    }
        driver.close();
}
}
