package auto.ria.data.colector;

import auto.ria.connector.AutoRiaConnector;
import com.auto.monitoring.utils.Constants;
import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.google.common.base.Charsets.ISO_8859_1;
import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.base.Splitter.*;

/**
 * Collector data for search on auto.ria
 * Created by CHVE on 6/28/2015.
 */
public class CollectorSearchDataOnAutoRia {
    //css selectors
    private static final String CSS_SEL_MARKS = "#marks > option";
    private static final String ATTR_VALUE = "value";

    private static final Logger LOGGER = LoggerFactory.getLogger(CollectorSearchDataOnAutoRia.class);

    private static void getMarks() throws InterruptedException {
        long timeStart = System.currentTimeMillis();
        try (AutoRiaConnector riaConnector = new AutoRiaConnector(Constants.AUTO_RIA_HOST)) {
            Thread.sleep(5000l);
            List<WebElement> markElements = riaConnector.findElements(By.cssSelector(CSS_SEL_MARKS));
            LOGGER.debug("Found : "+markElements.size()+" marks");
            Map<String, String> markAndCode = new HashMap();
            for (WebElement webEl : markElements) {
                String name = on(" ").split(webEl.getText()).iterator().next();
                String attribute = webEl.getAttribute(ATTR_VALUE);
                markAndCode.put(name, attribute);
            }
            long avgTime = System.currentTimeMillis() - timeStart;
            System.out.println("TIME : "+avgTime);
            System.out.println("COUNT : "+markElements.size());

            System.out.println("\n"+markAndCode);

        } catch (Exception e) {
            System.out.println("ERROR (((");
        }

    }

    public static void main(String[] args) throws InterruptedException {
        getMarks();
    }

}
