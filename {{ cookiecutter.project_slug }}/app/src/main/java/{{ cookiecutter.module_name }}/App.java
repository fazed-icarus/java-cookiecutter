/*
 *
 * This is a sample project
 * simply displays "Hello World!" to the standard output.
 *
 * @author {{ cookiecutter.author }}
 *
*/

package {{ cookiecutter.module_name }};

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class App {

    private static final Logger LOG = LogManager.getLogger(App.class);

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        LOG.info(new App().getGreeting());
    }
}
