package com.gzh.youth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import com.gzh.youth.listener.ApplicationStartUpErrorPropListener;

@ServletComponentScan //扫描对应的servlet 包
@SpringBootApplication // 申明让spring boot自动给程序进行必要的配置，
               	//等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		application.addListeners(new ApplicationStartUpErrorPropListener());
		application.run(args);
	}
}
