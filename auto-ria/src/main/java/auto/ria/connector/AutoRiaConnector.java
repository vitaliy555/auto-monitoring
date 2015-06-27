package auto.ria.connector;

import com.auto.monitoring.utils.SettingWebDriverCapability;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 * Created by CHVE on 6/27/2015.
 */
public class AutoRiaConnector extends PhantomJSDriver{
    public AutoRiaConnector() {
        super(SettingWebDriverCapability.getInstance());
    }
}
