package Day1_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_BrowserCommand {
    public static void main(String[] args) {
// Create main method

// Set Path

// Create chrome driver

// Open google home page: https://www.google.com

// Get Title on page

// Get Current URL on page

// Close/Quit the browser





        // Driver objemizi olusturduk

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\IdeaProjects\\selenium\\Depencies\\drivers\\chromedriver.exe");


        WebDriver driver=new ChromeDriver();

        // https://www.google.com sitesini ziyaret ettik

        driver.get("https://www.google.com");


        // sayfa basligi (pageTitle) ve suanda bulunan url (currentUrl) degerini aldik.

        String pageTitle=driver.getTitle();
        String curretnUrl=driver.getCurrentUrl();

        //Aldigimiz degerleri yazdirdik

        System.out.println("page Title = " + pageTitle);
        System.out.println("curretnUrl = " + curretnUrl);

        // driver objemizi (browser) kapattik
        driver.quit();





    }
}
