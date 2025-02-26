package com.juaracodingsqa20.kelompok3.drivers.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracodingsqa20.kelompok3.drivers.DriverSingleton;

public class DriverWaitHelper {
    public final static WebDriverWait DRIVER_WAIT = new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(30));

    public static WebElement waitForVisibility(WebDriver driver, By searchInput, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'waitForVisibility'");
    }

    public static WebElement waitForClickable(WebDriver driver, By searchButton, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'waitForClickable'");
    }
}
