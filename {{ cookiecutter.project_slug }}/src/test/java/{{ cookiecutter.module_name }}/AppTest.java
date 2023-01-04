/*
 *
 * This is a sample test
 *
 * @author {{ cookiecutter.author }}
 *
*/

package {{ cookiecutter.module_name }};

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    /* default */ public String testMessage;

    public AppTest() {
      testMessage = new WebApp().getGreeting();
    }

    @Test
    public void appHasAGreeting() {
        final AppTest obj = new AppTest();
        assertNotNull("Empty Message", obj.testMessage);
    }
}
