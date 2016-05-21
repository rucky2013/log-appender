package io.log.log4j;

import org.apache.log4j.or.ObjectRenderer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by percy on 5/20/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationBootstrap.class)
public class TrainingLog4jAppenderTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;
    @Test
    public void test() {
        User user = new User();
        user.setName("Percy");
        user.setId(1L);
        ObjectRenderer renderer;
        logger.info("userService:{},{}", (userService == null), user);
    }

}


class User {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}