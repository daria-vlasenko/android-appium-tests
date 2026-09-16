package com.mobile.config;

import java.time.Duration;

public final class MobileConfig {

    public static final String APPIUM_SERVER_URL =
            System.getProperty("appium.url", "http://127.0.0.1:4723");

    public static final String PLATFORM_NAME = "Android";
    public static final String AUTOMATION_NAME = "UiAutomator2";

    public static final String DEVICE_NAME =
            System.getProperty("device.name", "Android Emulator");

    public static final String APP_PACKAGE =
            System.getProperty("app.package", "com.android.settings");
    public static final String APP_ACTIVITY =
            System.getProperty("app.activity", ".Settings");

    public static final Duration TIMEOUT = Duration.ofSeconds(10);
    public static final Duration NEW_COMMAND_TIMEOUT = Duration.ofSeconds(120);

    private MobileConfig() {
    }
}