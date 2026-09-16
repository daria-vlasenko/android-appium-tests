package com.mobile.screens;

import com.mobile.config.MobileConfig;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingsScreen {

    private static final By ANY_LABEL = AppiumBy.className("android.widget.TextView");

    private final AndroidDriver driver;
    private final WebDriverWait wait;

    public SettingsScreen(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, MobileConfig.TIMEOUT);
    }

    @Step("Дождаться отрисовки стартового экрана")
    public SettingsScreen shouldBeOpened() {
        wait.until(ExpectedConditions.presenceOfElementLocated(ANY_LABEL));
        return this;
    }

    @Step("Определить приложение на переднем плане")
    public String currentPackage() {
        return driver.getCurrentPackage();
    }
}