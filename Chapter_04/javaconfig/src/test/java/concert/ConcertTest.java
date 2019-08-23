package concert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertTest {

    @Rule
    public final StandardOutputStreamLog log =
            new StandardOutputStreamLog();



    @Autowired
    private Performance performance;

    @Test
    public void performanceShouldNotBeNull() {
        assertNotNull(performance);
    }

    @Test
    public void singing(){
        performance.perform();

        assertEquals("Silencing cell phones\r\n" +
                "Taking seats\r\n" +
                "Sing a song!\r\n" +
                "CLAP CLAP CLAP!!!\r\n",log.getLog());
    }

}
