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

import java.time.Duration;

public class SettingsScreen {

    private static final By ANY_LABEL = AppiumBy.className("android.widget.TextView");
    private static final By SEARCH_ENTRY = AppiumBy.id("com.android.settings:id/search_action_bar");
    private static final By SEARCH_INPUT = AppiumBy.className("android.widget.EditText");

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
        driver.runAppInBackground(Duration.ofSeconds(seconds));
        return this;
    }

    @Step("Проверить, что элемент с текстом {text} отображается")
    public SettingsScreen shouldShowText(String text) {
        wait.until(ExpectedConditions.presenceOfElementLocated(
                AppiumBy.androidUIAutomator(
                        "new UiSelector().textContains(\"" + text + "\")")));
        return this;
    }

    @Step("Открыть поиск по настройкам")
    public SettingsScreen openSearch() {
        wait.until(ExpectedConditions.elementToBeClickable(SEARCH_ENTRY)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(SEARCH_INPUT));
        return this;
    }

    @Step("Ввести в поиск текст {query}")
    public SettingsScreen typeInSearch(String query) {
        WebElement input = wait.until(
                ExpectedConditions.presenceOfElementLocated(SEARCH_INPUT));
        input.clear();
        input.sendKeys(query);
        return this;
    }

    @Step("Получить введённый в поиск текст")
    public String searchInputText() {
        return driver.findElement(SEARCH_INPUT).getText();
    }

    @Step("Скрыть системную клавиатуру")
    public SettingsScreen hideKeyboard() {
        if (driver.isKeyboardShown()) {
            driver.hideKeyboard();
        }
        return this;
    }

    @Step("Проверить, что клавиатура показана")
    public boolean isKeyboardShown() {
        return driver.isKeyboardShown();
    }
}