package lk.nayomi.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Bean1 {
    public Bean1() {
        System.out.println("bean1");
    }
//LiteMode
    @Bean
    public Bean2 bean2(){
        return new Bean2();
    }
    @Bean
    public Bean3 bean3(){
        return new Bean3();
    }
}
