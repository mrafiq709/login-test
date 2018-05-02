//package com.rafiq.neurogen;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@EnableWebMvc
//@Configuration
//public class StaticResourceConfiguration extends WebMvcConfigurerAdapter {
//	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
//			"classpath:/META-INF/resources/", "classpath:/resources/",
//			"classpath:/static/", "classpath:/public/" };
//	
//	@Override
//	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//		configurer.enable();
//	}
//
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/resources/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
//	}
//}