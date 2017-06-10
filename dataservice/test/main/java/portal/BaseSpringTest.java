package portal;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseSpringTest {

    @Configuration
    @Import({
    })
    @ImportResource({ "classpath:beans/beans.xml" })
    public static class ContextConfig {}
}
