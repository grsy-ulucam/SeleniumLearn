package Day2_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class C02_ManageWindowCommands {
    // Go to the Amazon URL : https://www.amazon.com/
// Print the position and size of the page.
// Adjust the position and size of the page as desired.
// Test that the page is in the position and size you want.
// Close the page.


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Dependencies\\drives\\chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        driver.get("https://wwww.amazon.com/");

        System.out.println("Browserımızın pozisyonu " + driver.manage().window().getPosition());
        System.out.println("Browserımızın boyutu " + driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(250,100));

       driver.manage().window().setSize(new Dimension(1000,1500));

       int height=driver.manage().window().getSize().getHeight();
       int width=driver.manage().window().getSize().getWidth();

        System.out.println("height = " + height);
        System.out.println("width = " + width);
        System.out.println("Browserin boyutu test ediliyor");
       if (width==1000&&height==1500){
           System.out.println("passed");
       }else System.out.println("failer");

       int X=driver.manage().window().getPosition().getX();
       int Y=driver.manage().window().getPosition().getY();

        System.out.println( "Browserin boyotu test ediliyor");

        if (X==250 && Y==100){
            System.out.println("passsed");
        }else System.out.println("failer");

       Thread.sleep(5000);

       driver.quit();

    }
}
