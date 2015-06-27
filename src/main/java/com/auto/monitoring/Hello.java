package com.auto.monitoring;

import net.anthavio.phanbedder.Phanbedder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;



public class Hello {
    public static void main(String[] args) throws IOException {
        String url = "http://auto.ria.com/search/?category_id=1&marka_id=47&model_id=0&state=0&currency=1#category_id=1&currency=1&marka_id[0]=47&model_id[0]=0&state[0]=0&countpage=10";

//
//        PhantomJSDriver driver = new PhantomJSDriver(dcaps);
//        //Usual Selenium stuff...
//        driver.get(url);
////        System.out.println(driver.getPageSource());
//        System.out.println(driver.findElement(By.cssSelector(".ticket-item.paid")));
////        WebElement query = driver.findElement(By.name("q"));
//        driver.quit();
    }


}
