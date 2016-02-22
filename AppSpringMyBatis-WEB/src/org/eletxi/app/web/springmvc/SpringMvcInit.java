package org.eletxi.app.web.springmvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Clase 'SpringMvcInit'.
 * @author Omar Eletxigerra Cano
 * @version 1.0 - Versión inicial.
 */
public class SpringMvcInit implements WebApplicationInitializer {

	@Override
	public final void onStartup(final ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(SpringMvcConfig.class);
		container.addListener(new ContextLoaderListener(context));
		ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(context));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("*.action");
	}
}
