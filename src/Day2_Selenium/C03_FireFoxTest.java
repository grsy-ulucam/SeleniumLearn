package Day2_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C03_FireFoxTest {
    public static void main(String[] args) {

//        Invoke FireFox Driver
//        Go to https://www.youtube.com/
//        Verify the page title contains the word video.
//        Close the driver.



        System.setProperty("webdriver.gecko.driver","C:\\Users\\Acer\\IdeaProjects\\SeleniumLearn\\Dependencies\\drives\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.youtube.com");

        System.out.println("driver.getTitle() = " + driver.getTitle());

        String title = driver.getTitle();

        if (title.contains("video")) {

            System.out.println("test passed");

        }else System.out.println("test failed");



        driver.close();





    }
}
