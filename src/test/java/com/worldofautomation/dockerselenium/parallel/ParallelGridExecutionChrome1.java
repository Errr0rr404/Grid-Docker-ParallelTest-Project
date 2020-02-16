package com.worldofautomation.dockerselenium.parallel;

import com.worldofautomation.dockerselenium.TestBase;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ParallelGridExecutionChrome1 {

    private static RemoteWebDriver driver;

    static {
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
        URL url = null;
        try {
            url = new URL("http://localhost:4444/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new RemoteWebDriver(url, desiredCapabilities);
    }

    @Test
    public void testAmazonExecution() {
        driver.get("https://www.amazon.com");
        System.out.println("amazon loaded");
        System.out.println("current url is : " + driver.getCurrentUrl());
        System.out.println("current page title is : " + driver.getTitle());
        TestBase.captureScreenshot(driver, "amazon");
        driver.close();
    }


}
