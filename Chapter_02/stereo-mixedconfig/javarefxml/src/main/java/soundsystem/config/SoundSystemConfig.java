package soundsystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@Import({CDPlayerConfig.class, CDConfig.class})
@Import(CDPlayerConfig.class)
@ImportResource("classpath:META-INF/spring/compactdisc.xml")
public class SoundSystemConfig {
}
