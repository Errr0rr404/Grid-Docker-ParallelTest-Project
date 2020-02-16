package com.worldofautomation.dockerselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SingleGridExecution {

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
    public void testJenkinsExecution() throws InterruptedException {
        driver.get("https://www.amazon.com");
        System.out.println("amazon page loaded");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java Books");
        driver.findElement(By.xpath("//div[@id='nav-search']/form[@role='search']//input[@value='Go']")).click();
        System.out.println("current url is : " + driver.getCurrentUrl());
        System.out.println("current page title is : " + driver.getTitle());
        TestBase.captureScreenshot(driver, "test");
        Thread.sleep(5);
        driver.quit();
    }
}
