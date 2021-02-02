package consumers.main.controller;

import api.server.TestService;
import com.alibaba.dubbo.config.annotation.Reference;
import consumers.main.entity.UserEntitiy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Reference(group = "cn")
    private TestService testService;

    @GetMapping("/say")
    public UserEntitiy sayHello(String name) throws Exception {
        UserEntitiy userEntitiy = new UserEntitiy();
//        System.out.println(testService.sayHello(name));
        userEntitiy.setName(name);
        userEntitiy.setSay(testService.sayHello(name));
        return userEntitiy;
    }

    @GetMapping("/test")
    public void test(){
        System.out.println("this is test");
    }
}
