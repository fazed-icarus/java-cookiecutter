/*
 *
 * This is a sample test
 *
 * @author {{ cookiecutter.author }}
 *
*/

package {{ cookiecutter.project_name }};

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
