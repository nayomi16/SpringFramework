package lk.nayomi.spring.main;

import lk.nayomi.spring.bean.Bean1;
import lk.nayomi.spring.bean.Bean2;
import lk.nayomi.spring.bean.Bean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.nayomi.spring.bean")
public class AppConfig {
    //FullMode
//    @Bean
//    public Bean2 bean2(){
//        return new Bean2();
//    }
//    @Bean
//    public Bean3 bean3(){
//        return new Bean3();
//    }
}
