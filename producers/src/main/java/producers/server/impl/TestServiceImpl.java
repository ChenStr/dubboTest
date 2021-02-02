package producers.server.impl;

import api.server.TestService;
import com.alibaba.dubbo.config.annotation.Service;



@Service()
public class TestServiceImpl implements TestService {

    public String sayHello(String name) throws Exception{
        return "Hello " + name + " I'm provider!";
    }
}
