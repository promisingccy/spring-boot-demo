package myapp;

import myapp.config.PersonConfig;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//开启了Spring的组件扫描和Spring Boot的自动配置功能 相当于如下三个配置
//Spring的@Configuration：标明该类使用Spring基于Java的配置
//Spring的@ComponentScan：启用组件扫描
//Spring Boot 的 @EnableAutoConfiguration 开启了自动配置的魔力，不用再写成篇的配置了
@SpringBootApplication
@EnableConfigurationProperties({PersonConfig.class})
public class MyappApplication {//该类为启动引导类

	public static void main(String[] args) {
//		SpringApplication.run(MyappApplication.class, args);
		SpringApplication app = new SpringApplication(MyappApplication.class);
		//不显示banner
//		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

}
