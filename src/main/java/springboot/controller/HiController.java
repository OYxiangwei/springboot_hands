package springboot.controller;

import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value = "classpath:test.properties")//使用非默认的properties文件
public class HiController {

    @Value("${name}")
    private String hello;

    @RequestMapping("hi")
    public String hi(){
        return hello;
    }
}
