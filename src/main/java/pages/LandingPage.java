package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage {

    WebDriver driver;
    private final int generalTimeout = 20;


    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By logoutButton = By.cssSelector("#content > div > a");
    private final By landingPageMessage = By.id("flash");


    public void clickLogoutButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(generalTimeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutButton));
        driver.findElement(logoutButton).click();
    }

    public String verifyLoginMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(generalTimeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(landingPageMessage));
        return driver.findElement(landingPageMessage).getText();
    }
}