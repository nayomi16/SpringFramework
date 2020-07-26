package lk.nayomi.Spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl2 implements GoodGirl{
    @Override
    public void kiss() {
        System.out.println("ok");
        System.out.println("ok");
        System.out.println("ok");
    }
}
