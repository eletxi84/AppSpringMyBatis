package org.eletxi.app.jar.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Clase 'SpringConfig'.
 * @author Omar Eletxigerra Cano
 */
@Configuration
@ComponentScan(basePackages = {"org.eletxi.app.dao.mybatis",
		"org.eletxi.app.dao.mybatis.dao"})
public class SpringConfig {
}
