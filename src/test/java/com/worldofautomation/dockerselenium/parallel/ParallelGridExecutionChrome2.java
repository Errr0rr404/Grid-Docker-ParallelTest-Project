package com.worldofautomation.dockerselenium.parallel;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ParallelGridExecutionChrome2 {

    private static RemoteWebDriver driver;

    static {
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        URL url = null;
        try {
            url = new URL("http://localhost:4444/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new RemoteWebDriver(url, desiredCapabilities);
    }

    @Test
    public void testGoogleExecution() {
        driver.get("https://www.google.com");
        System.out.println("google loaded");
        System.out.println("current url is : " + driver.getCurrentUrl());
        System.out.println("current page title is : " + driver.getTitle());

        driver.close();
    }

}