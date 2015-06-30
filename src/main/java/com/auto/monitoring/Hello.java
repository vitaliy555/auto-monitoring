package com.auto.monitoring;

import java.io.File;
import java.io.IOException;
import java.util.List;

import net.anthavio.phanbedder.Phanbedder;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Hello {
    public static void main(String[] args) throws IOException, InterruptedException {
        PhantomJSDriver driver = null;
        try {
            File phantomjs = Phanbedder.unpack(); //Phanbedder to the rescue!
            DesiredCapabilities dcaps = new DesiredCapabilities();
            dcaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, phantomjs.getAbsolutePath());
            driver = new PhantomJSDriver(dcaps);
            driver.get("http://auto.ria.com");

            // Find the text input element by its name
            List<WebElement> marks = driver.findElements(By.cssSelector("#marks > option"));
            for (WebElement we : marks) {
                System.out.println(we.getText());
            }
            System.out.println("Page title is: " + driver.getTitle());



            System.out.println("Page title is: " + driver.getTitle());

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // Close the browser
            driver.quit();
        }
    }

}
