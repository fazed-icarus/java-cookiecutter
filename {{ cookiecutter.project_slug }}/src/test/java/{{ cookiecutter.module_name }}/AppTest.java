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
    @Test
    public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting());
    }
}
