package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class C01_WebElements {
    public static void main(String[] args) throws InterruptedException {
   //<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
    //placeholder="E-Mail-Adresse oder Telefonnummer" autofocus="1" aria-label="E-Mail-Adresse oder Telefonnummer">
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mmsol\\OneDrive\\Masaüstü\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        //email textbox a ali yazdiralim
        WebElement mailTextBox =driver.findElement(By.id("email"));
        mailTextBox.sendKeys("solmazgulselenium@gmail.com");

        Thread.sleep(3000);
        mailTextBox.clear();
        WebElement mailKutusuTagNameIle=driver.findElement(By.tagName("input"));
        //mailKutusuTagNameIle.sendKeys("abc@gmail.com");
        //input tagname`i ile 6 tane webelement oldugundan hangisini yazacagina karar veremiyor
        //webelementi buldugu icin noSuchElementException vermez

       // WebElement yanlisElement= driver.findElement(By.id("emailyanlis"));
       // yanlisElement.sendKeys("yanlis eleman");

        //giris yap butonuna tiklayalim
        WebElement girisButonu=driver.findElement(By.tagName("button"));

        System.out.println(girisButonu.isEnabled());
        girisButonu.click();



    }
}
