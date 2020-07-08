package lk.nayomi.spring.Beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 implements DisposableBean {
    SpringBean2(){
        System.out.println("SpringBean2 is instantiate");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean2 closed");
    }
}
