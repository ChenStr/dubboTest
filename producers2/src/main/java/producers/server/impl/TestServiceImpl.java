package producers.server.impl;

import api.server.TestService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(group = "cn",loadbalance = "roundrobin")
public class TestServiceImpl implements TestService {
    public String sayHello(String name) {
        return "你好，我是" + name;
    }
}
