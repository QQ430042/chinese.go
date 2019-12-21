package org.chinese.go;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.web.servlet.ServletComponentScan;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * 
 *  平台启动类
 *
 * @author 2430042@qq.com
 * @createDate 2019年12月21日
 * @version 2.x.x.RELEASE
 * @Project chinese.go.web
 *
 * @copyright www.chinesego.org
 */
//@EnableCaching
//@Configuration
//@EnableAutoConfiguration(exclude = { org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class })
//@EnableJpaRepositories(basePackages = "org.chinese.go")
//@EntityScan(basePackages = "org.chinese.go")
//@ServletComponentScan(basePackages = "org.chinese.go")
@SpringBootApplication(scanBasePackages = { "org.chinese.go" })
public class ChineseGoStarter {

	private static final Logger LOGGER = LoggerFactory.getLogger(ChineseGoStarter.class);

	/**
	 * chineseGo 平台启动入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.info("ChineseGoStarter start ...");
		LOGGER.info("www.chinesego.org");
		SpringApplication.run(ChineseGoStarter.class, args);

	}

}
