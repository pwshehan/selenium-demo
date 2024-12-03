package codes.pwshehan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        // Setup WebDriver for Edge
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        try {
            // Navigate to the login page
            driver.get("https://apluseducation.lk/auth/login");

            // Wait until the email field is visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-mobile")));
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-password")));
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));

            // Perform actions
            emailField.sendKeys("test@example.com");
            passwordField.sendKeys("password123");
            loginButton.click();

        } catch (Exception e) {
            e.printStackTrace(); // Print error details
        } finally {
            driver.quit(); // Ensure the browser closes
        }
    }
}
