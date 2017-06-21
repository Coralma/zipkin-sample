package brave.service;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by ccc on 2017/6/19.
 */
@Service("brave.service.CoralService")
public class CoralService {

    public String call(String data) throws InterruptedException {
        Random random = new Random();
        Thread.sleep(random.nextInt(1000));
        return "b" ;
    }
}
