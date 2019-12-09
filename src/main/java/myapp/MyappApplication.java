package myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//开启了Spring的组件扫描和Spring Boot的自动配置功能 相当于如下三个配置
//Spring的@Configuration：标明该类使用Spring基于Java的配置
//Spring的@ComponentScan：启用组件扫描
//Spring Boot 的 @EnableAutoConfiguration 开启了自动配置的魔力，不用再写成篇的配置了
@SpringBootApplication
public class MyappApplication {//该类为启动引导类

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

}
