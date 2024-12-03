package codes.pwshehan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {
        // Set up WebDriver for Microsoft Edge
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        try {
            // Navigate to a website
            driver.get("https://www.google.com");

            // Print the title of the webpage
            System.out.println("Page Title: " + driver.getTitle());

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
