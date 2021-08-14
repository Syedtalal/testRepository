package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Chromerdriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
                WebElement password;
        password = driver.findElement(By.id("input-password"));
        password.sendKeys("Pakistan123");

        WebElement LoginButton;
        LoginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginButton.click();

        WebElement searchElement;
        searchElement = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
        searchElement.sendKeys("HP LP3065");

        WebElement searchButton;
        searchButton = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
        searchButton.click();

        WebElement addtoCartButton;
        addtoCartButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]"));
        addtoCartButton.click();

        WebElement addCartButton;
        addCartButton = driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
        addCartButton.click();

        //*[@id="button-cart"]

        //String actualpagetitle = driver.getTitle();
        //String expectedtitle = "Account Logout";

        //if(actualpagetitle.contentEquals(expectedtitle))
        //System.out.println("Test Passed!");
        //else {
        //System.out.println("Test Failed");
        //}

        //driver.close();
        //driver.quit();

            }

        }

