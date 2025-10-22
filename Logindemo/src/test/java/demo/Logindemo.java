package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Logindemo {
    WebDriver driver;
    @BeforeMethod
    public void openGoogle() {
        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://organization-frotnend3-gold.vercel.app/");
        System.out.println("✅ Page title is: " + driver.getTitle());
    }
    @Test
    public void loginToSite() throws InterruptedException {
        // Locate elements and perform login
        WebElement username = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/form/div[1]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/form/div[2]/input"));
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/form/button[1]"));

        username.sendKeys("admin@example.com");
        password.sendKeys("aszx1234");
        loginBtn.click();

        // Wait for page to load
        Thread.sleep(2000);

        // Verify login success
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/admin/UltimateHoldingCompany"), "Login failed!");

        System.out.println("✅ Login successful! Current URL: " + currentUrl);
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("Browser closed");
    }
}

