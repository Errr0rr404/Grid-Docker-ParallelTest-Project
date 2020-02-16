package com.worldofautomation.dockerselenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestBase {

    public static String captureScreenshot(RemoteWebDriver driver, String screenshotName) {
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);
        String destination = null;
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            destination = System.getProperty("user.dir") + "/screenshots/" + screenshotName + " " + df.format(date) + ".png";
            FileUtils.copyFile(file, new File(destination));
        } catch (Exception ignored) {
        }
        return destination;
    }
}
