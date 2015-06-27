package com.auto.monitoring.utils;

import com.google.common.base.MoreObjects;
import net.anthavio.phanbedder.Phanbedder;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

/**
 * Created by CHVE on 6/27/2015.
 *
 * Extensions DesiredCapabilities
 */
public class SettingWebDriverCapability extends DesiredCapabilities {
    private static SettingWebDriverCapability dcci= null;
    private SettingWebDriverCapability() {
        File phantomjs = Phanbedder.unpack();
        setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, phantomjs.getAbsolutePath());
    }

    /**
     * SettingWebDriverCapability
     * @return meta data from browser
     */
    public static SettingWebDriverCapability getInstance(){
        return MoreObjects.firstNonNull(dcci,new SettingWebDriverCapability());
    }
}
