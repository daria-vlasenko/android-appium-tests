import com.mobile.config.MobileConfig;
import com.mobile.screens.SettingsScreen;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Android")
@Feature("Запуск приложения")
class SmokeTests extends BaseMobileTest {

    @Test
    @DisplayName("Приложение под тестом запускается и открывает стартовый экран")
    void appLaunchesAndShowsStartScreen() {
        String currentPackage = new SettingsScreen(driver)
                .shouldBeOpened()
                .currentPackage();

        Assertions.assertEquals(
                MobileConfig.APP_PACKAGE,
                currentPackage,
                "На переднем плане оказалось другое приложение");
    }
}