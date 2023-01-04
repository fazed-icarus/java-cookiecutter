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

public class WebApp {

    private static final Logger LOG = LogManager.getLogger(WebApp.class);

    public String retMessage;

    public WebApp() {
      retMessage = "Hello World!";
    }

    public String getGreeting() {
        return retMessage;
    }

    public static void main(final String[] args) {
        if (LOG.isInfoEnabled()) {
          LOG.info(new WebApp().getGreeting());
        }
    }
}
