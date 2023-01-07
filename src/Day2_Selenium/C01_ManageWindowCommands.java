package Day2_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ManageWindowCommands {


//        Invoke Chrome Browser
//        Open URL: https://www.google.com/
//        Maximize the window.
//        Print the position and size of the page.
//        Minimize the page.
//        Wait 5 seconds in the icon state and maximize the page.
//                Print the position and dimensions of the page in maximized state.
//        Make the page fullscreen.
//        Close the Browser.
public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\IdeaProjects\\SeleniumLearn\\Dependencies\\drives\\chromedriver.exe");

    WebDriver driver =new ChromeDriver();

    driver.get("https://www.google.com/");

    driver.manage().window().maximize();

    Point point =driver.manage().window().getPosition();

    int posX=point.getX();
    int posY= point.getY();
    System.out.println("Sayfamızın x kordinatı ="+posX);
    System.out.println("Sayfamızın y kordinatı ="+posY);

    Dimension dimension =driver.manage().window().getSize();

    int h= driver.manage().window().getSize().getHeight();
    int w= driver.manage().window().getSize().getWidth();

    System.out.println("Browserımızın yüksekliği =" + h);
    System.out.println("Browserımızın genişliği =" + w);

    driver.manage().window().minimize();

    Thread.sleep(5000);

    driver.manage().window().maximize();
    Point point1 =driver.manage().window().getPosition();

    int posX1=point.getX();
    int posY1= point.getY();
    System.out.println("Sayfamızın x kordinatı ="+posX1);
    System.out.println("Sayfamızın y kordinatı ="+posY1);

    Dimension dimension1 =driver.manage().window().getSize();

    int h1= driver.manage().window().getSize().getHeight();
    int w1= driver.manage().window().getSize().getWidth();

    System.out.println("Browserımızın yüksekliği =" + h1);
    System.out.println("Browserımızın genişliği =" + w1);

    driver.manage().window().fullscreen();

    driver.quit();


}
}
