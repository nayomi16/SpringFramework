package lk.nayomi.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appinicielizer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(Appconfig.class);
        ctx.refresh();
        System.out.println("ok");
    }
}
