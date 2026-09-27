package com.mobile.screens;

import com.mobile.config.MobileConfig;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
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

    @Step("Определить текущий экран")
    public String currentActivity() {
        return driver.currentActivity();
    }

    @Step("Прокрутить список до элемента с текстом {text}")
    public WebElement scrollTo(String text) {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
    }

    @Step("Открыть раздел {sectionName}")
    public SettingsScreen openSection(String sectionName) {
        scrollTo(sectionName).click();
        return this;
    }

    @Step("Нажать аппаратную кнопку Назад")
    public SettingsScreen pressBack() {
        driver.navigate().back();
        return this;
    }

    @Step("Повернуть экран в положение {orientation}")
    public SettingsScreen rotateTo(ScreenOrientation orientation) {
        driver.rotate(orientation);
        return this;
    }

    @Step("Определить текущую ориентацию экрана")
    public ScreenOrientation currentOrientation() {
        return driver.getOrientation();
    }

    @Step("Свернуть приложение на {seconds} секунд и вернуть")
    public SettingsScreen sendToBackgroundAndReturn(int seconds) {
        driver.runAppInBackground(java.time.Duration.ofSeconds(seconds));
        return this;
    }

    @Step("Проверить, что элемент с текстом {text} отображается")
    public SettingsScreen shouldShowText(String text) {
        wait.until(ExpectedConditions.presenceOfElementLocated(
                AppiumBy.androidUIAutomator(
                        "new UiSelector().textContains(\"" + text + "\")")));
        return this;
    }
}