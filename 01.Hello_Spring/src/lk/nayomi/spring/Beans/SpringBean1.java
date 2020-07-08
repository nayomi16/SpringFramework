package lk.nayomi.spring.Beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 implements DisposableBean {
    SpringBean1(){
        System.out.println("Bean Instantiated");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean1 closed");
    }
}
