package lk.nayomi.spring.main;

import lk.nayomi.spring.Beans.SpringBean1;
import lk.nayomi.spring.Beans.SpringBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appinicielizer {
    public static void main(String[] args) {
//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("JVM is going to shutdown");
//            }
//        }));

        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(Appconfig.class);
        ctx.refresh();
        SpringBean1 bean1 = ctx.getBean(SpringBean1.class);
        SpringBean1 bean2 = ctx.getBean(SpringBean1.class);
//
        SpringBean2 bean3 = ctx.getBean(SpringBean2.class);
        SpringBean2 bean4 = ctx.getBean(SpringBean2.class);
//        System.out.println(bean3);
//        System.out.println(bean4);
        ctx.registerShutdownHook();

        System.out.println("ended");


    }
}
