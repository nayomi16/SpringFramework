package lk.nayomi.Spring.main;

import lk.nayomi.Spring.bean.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.getBean(Boy.class).kiss();
        ctx.registerShutdownHook();
    }

}
