import com.mobile.config.MobileConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.net.MalformedURLException;
import java.net.URI;

public abstract class BaseMobileTest {

    protected AndroidDriver driver;

    @BeforeEach
    void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName(MobileConfig.PLATFORM_NAME)
                .setAutomationName(MobileConfig.AUTOMATION_NAME)
                .setDeviceName(MobileConfig.DEVICE_NAME)
                .setAppPackage(MobileConfig.APP_PACKAGE)
                .setAppActivity(MobileConfig.APP_ACTIVITY)
                .setNewCommandTimeout(MobileConfig.NEW_COMMAND_TIMEOUT);

        driver = new AndroidDriver(
                URI.create(MobileConfig.APPIUM_SERVER_URL).toURL(),
                options);
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}