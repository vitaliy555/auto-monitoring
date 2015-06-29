package com.auto.monitoring;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import net.anthavio.phanbedder.Phanbedder;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;


public class Hello {
    public static void main(String[] args) throws IOException, InterruptedException {
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setJavascriptEnabled(true);                //< not really needed: JS enabled by default
//        caps.setCapability("takesScreenshot", true);    //< yeah, GhostDriver haz screenshotz!
//        caps.setCapability(
//                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
//                Phanbedder.unpack().getAbsolutePath()
//        );

        // Launch driver (will take care and ownership of the phantomjs process)
        System.setProperty("webdriver.chrome.driver", "D:/idea/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=0,0");

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(capabilities);
        driver.get("http://auto.ria.com");

        Thread.sleep(5000l);

        List<WebElement> markElements = driver.findElements(By.cssSelector("#marks > option"));
        System.out.println(markElements.size());
        driver.quit();
    }


}
