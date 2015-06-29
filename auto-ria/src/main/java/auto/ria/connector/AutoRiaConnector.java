package auto.ria.connector;

import com.auto.monitoring.utils.SettingWebDriverCapability;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 * Created by CHVE on 6/27/2015.
 */
public class AutoRiaConnector extends PhantomJSDriver implements AutoCloseable{
    public AutoRiaConnector(String url) {
        super(SettingWebDriverCapability.getInstance());
        get(url);
    }

    @Override
    public void close() {
        this.quit();
    }
}
