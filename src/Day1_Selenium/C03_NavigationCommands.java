package Day1_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigationCommands {
    public static void main(String[] args) {
//    Invoke Chrome Browser

//    Navigate to URL: https://clarusway.com/

//    Navigate to URL: http://amazon.com/

//    Come back to the Clarusway using the back command.

//    Again go back to the amazon website using forward command

//    Refresh the Browser using refresh command.

//    Close the Browser.

        // Chromedriver i uyandirdik


           System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\IdeaProjects\\SeleniumLearn\\Dependencies\\drives\\chromedriver.exe");

        WebDriver driver =new ChromeDriver();


        //clarusway sitesine gittik

        driver.navigate().to("https://clarusway.com/");


        //amazon sitesine gittik
        driver.navigate().to("http://amazon.com/");


        //geri tusuyla clarusway e geri donduk
        driver.navigate().back();


        //ileri tusuyla amazon a geri donduk
        driver.navigate().forward();


        // sayfamizi yeniledik
        driver.navigate().refresh();


        // browser imizi kapattik.

          driver.quit();

        //driver.close();








    }
}
