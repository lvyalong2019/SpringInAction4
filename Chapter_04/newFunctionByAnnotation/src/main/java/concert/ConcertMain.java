package concert;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConcertMain {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConcertConfig.class);
        Performance performance = context.getBean(Performance.class);
        Encoreable encoreable = (Encoreable) performance;
        performance.perform();
        encoreable.performEncore();
        context.close();
    }

}