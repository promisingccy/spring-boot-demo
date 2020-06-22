package myapp.controller;

import myapp.config.PersonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PersonController
 * @Description //TODO
 * @Author ccy
 * @Date 2020/6/22 14:52
 * @Version 1.0
 **/
@RestController
public class PersonController {
    @Autowired
    private PersonConfig personConfig;

    @RequestMapping("/")
    String index() {
        return personConfig.getName()+"——"+personConfig.getSex();
    }
}
