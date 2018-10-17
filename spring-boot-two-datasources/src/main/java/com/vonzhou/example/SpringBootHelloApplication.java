package com.vonzhou.example;

import com.vonzhou.example.config.YamlConfigFiles;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan(basePackages = "com.vonzhou.example")
public class SpringBootHelloApplication {

	public static void main(String[] args) {
		String[] newArgs = args;
		int newLen = args.length + 1;
		newArgs = new String[newLen];
		System.arraycopy(args, 0, newArgs, 0, newLen - 1);
		newArgs[newLen - 1] = String.format("--spring.config.location=%s", YamlConfigFiles.getYamlConfigNames());

		// 设置app启动参数
		SpringApplication application = new SpringApplicationBuilder().sources(SpringBootHelloApplication.class)
				.addCommandLineProperties(true).registerShutdownHook(true).bannerMode(Banner.Mode.OFF).build(args);
		application.setWebEnvironment(true);
		application.run(newArgs);
//		SpringApplication.run(SpringBootHelloApplication.class, args);
	}
}
