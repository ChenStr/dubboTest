//package producers.controller;
//
//import api.server.TestService;
//import com.alibaba.dubbo.config.annotation.Reference;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/cnm")
//public class TestController {
//
//    @Reference
//    private TestService testService;
//
//    @GetMapping()
//    public void cnm(String name){
//        String str = testService.sayHello(name);
//        System.out.println(name);
//    }
//
//}
