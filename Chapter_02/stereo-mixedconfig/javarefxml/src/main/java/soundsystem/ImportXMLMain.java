package soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImportXMLMain {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "META-INF/spring/javarefxml.xml");
        CDPlayer cdPlayer = context.getBean(CDPlayer.class);
        cdPlayer.play();
        context.close();
    }

}
