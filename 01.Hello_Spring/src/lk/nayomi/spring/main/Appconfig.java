package lk.nayomi.spring.main;

import lk.nayomi.spring.Beans.SpringBeans3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.nayomi.spring.Beans")
public class Appconfig {

    @Bean
    public SpringBeans3 setBeans(){
        return new SpringBeans3();
    }
}

