package myapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName PersonConfig
 * @Description //TODO
 * @Author ccy
 * @Date 2020/6/22 14:42
 * @Version 1.0
 **/
@Configuration
@ConfigurationProperties(prefix = "ccy")
@PropertySource("classpath:application.properties")
@Component
public class PersonConfig {
    private String name;//
    private String sex;//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
