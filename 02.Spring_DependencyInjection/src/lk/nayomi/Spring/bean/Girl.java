package lk.nayomi.Spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl implements GoodGirl{

    @Override
    public void kiss() {
        System.out.println("kisssss");
    }
}
