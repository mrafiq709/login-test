package com.rafiq.neurogen;

import javax.servlet.ServletContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Description;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
@SpringBootApplication
public class NeurogenApplication {

//  @Bean
//  @Description("Thymeleaf View Resolver")
//  public ThymeleafViewResolver viewResolver(ServletContext servletContext) {
//  	
//      ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver(servletContext);
//      templateResolver.setTemplateMode("LEGACYHTML5");
//      templateResolver.setPrefix("/WEB-INF/views/");
//      templateResolver.setSuffix(".html");
//      templateResolver.setCacheable(false);
//      SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//      templateEngine.setTemplateResolver(templateResolver);
//      templateEngine.addDialect(new SpringSecurityDialect());
//      ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//      viewResolver.setTemplateEngine(templateEngine);
//      viewResolver.setCache(false);
//      viewResolver.setCharacterEncoding("UTF-8");
//      viewResolver.setOrder(1);
//      return viewResolver;
//  }
	
	public static void main(String[] args) {
		SpringApplication.run(NeurogenApplication.class, args);
	}
}
