package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\testRepository\\testProject\\Chromerdriver\\chromedriver.exe");
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
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addCartButton = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']"));
        addCartButton.click();

        WebElement itemButton = driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));
        itemButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement viewCart = driver.findElement(By.xpath("//p[@class=\"text-right\"]/a[@href='https://demo.opencart.com/index.php?route=checkout/cart']"));
        viewCart.click();

        WebElement removeItemfromCart = driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
        removeItemfromCart.click();



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

