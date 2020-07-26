package lk.nayomi.Spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl1 implements GoodGirl{

    @Override
    public void kiss() {

        System.out.println("kisssss");
        System.out.println("kisssss");
    }
}
