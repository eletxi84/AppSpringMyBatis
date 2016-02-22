package org.eletxi.app.web.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Clase 'SpringMvcConfig'.
 * @author Omar Eletxigerra Cano
 * @version 1.0 - Versión inicial.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.eletxi.app.jar.spring",
		"org.eletxi.app.jar.spring.service",
		"org.eletxi.app.web.springmvc"})
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

	/**
	 * Método 'getInternalResourceViewResolver'.
	 * @return InternalResourceViewResolver.
	 */
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
