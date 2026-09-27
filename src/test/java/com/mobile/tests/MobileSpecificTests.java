package com.mobile.tests;

import com.mobile.config.MobileConfig;
import com.mobile.screens.SettingsScreen;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.ScreenOrientation;

@Epic("Android")
@Feature("Мобильная специфика")
class MobileSpecificTests extends BaseMobileTest {

    private static final String SECTION = "System";
    private static final String SEARCH_QUERY = "battery";

    @Test
    @Story("Поворот экрана")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Приложение переживает поворот экрана и остаётся на переднем плане")
    void survivesScreenRotation() {
        SettingsScreen screen = new SettingsScreen(driver).shouldBeOpened();

        screen.rotateTo(ScreenOrientation.LANDSCAPE);
        Assertions.assertEquals(ScreenOrientation.LANDSCAPE, screen.currentOrientation(),
                "Экран не перешёл в альбомную ориентацию");
        Assertions.assertEquals(MobileConfig.APP_PACKAGE, screen.currentPackage(),
                "После поворота на переднем плане другое приложение");

        screen.rotateTo(ScreenOrientation.PORTRAIT);
        Assertions.assertEquals(ScreenOrientation.PORTRAIT, screen.currentOrientation(),
                "Экран не вернулся в книжную ориентацию");
        Assertions.assertEquals(MobileConfig.APP_PACKAGE, screen.currentPackage(),
                "После обратного поворота на переднем плане другое приложение");
    }

    @Test
    @Story("Поворот экрана")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Открытый раздел сохраняется при повороте экрана")
    void keepsOpenedSectionOnRotation() {
        SettingsScreen screen = new SettingsScreen(driver).shouldBeOpened();

        screen.openSection(SECTION);
        screen.shouldShowText(SECTION);
        String afterOpen = screen.currentActivity();

        screen.rotateTo(ScreenOrientation.LANDSCAPE);
        screen.shouldShowText(SECTION);
        Assertions.assertEquals(afterOpen, screen.currentActivity(),
                "После поворота в альбом сменился экран");

        screen.rotateTo(ScreenOrientation.PORTRAIT);
        screen.shouldShowText(SECTION);
        Assertions.assertEquals(afterOpen, screen.currentActivity(),
                "После обратного поворота сменился экран");
    }

    @Test
    @Story("Работа в фоне")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Приложение восстанавливается после сворачивания в фон")
    void restoresAfterBackground() {
        SettingsScreen screen = new SettingsScreen(driver).shouldBeOpened();

        screen.sendToBackgroundAndReturn(3);

        Assertions.assertEquals(MobileConfig.APP_PACKAGE, screen.currentPackage(),
                "После возврата из фона приложение не восстановилось");
        screen.shouldBeOpened();
    }

    @Test
    @Story("Навигация аппаратной кнопкой")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Аппаратная кнопка Назад возвращает на предыдущий экран")
    void hardwareBackReturnsToPreviousScreen() {
        SettingsScreen screen = new SettingsScreen(driver).shouldBeOpened();

        String rootActivity = screen.currentActivity();

        screen.openSection(SECTION);
        screen.pressBack();

        screen.shouldShowText(SECTION);
        Assertions.assertEquals(MobileConfig.APP_PACKAGE, screen.currentPackage(),
                "Кнопка Назад увела из приложения");
        Assertions.assertEquals(rootActivity, screen.currentActivity(),
                "Не вернулись на исходный экран");
    }

    @Test
    @Story("Прокрутка списка")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Элемент за пределами экрана находится после прокрутки")
    void findsElementAfterScrolling() {
        SettingsScreen screen = new SettingsScreen(driver).shouldBeOpened();

        Assertions.assertTrue(screen.scrollTo(SECTION).isDisplayed(),
                "Элемент не найден после прокрутки списка");
    }

    @Test
    @Story("Ввод текста")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Поиск принимает введённый текст и показывает результаты")
    void searchAcceptsTextInput() {
        SettingsScreen screen = new SettingsScreen(driver).shouldBeOpened();

        screen.openSearch()
                .typeInSearch(SEARCH_QUERY);

        Assertions.assertTrue(screen.searchInputText().toLowerCase().contains(SEARCH_QUERY),
                "Поле поиска не приняло введённый текст");

        screen.hideKeyboard();
        Assertions.assertFalse(screen.isKeyboardShown(),
                "Клавиатура осталась на экране после скрытия");
    }
}