package com.korvin.common.config.bean;

import javax.servlet.DispatcherType;

import org.apache.shiro.web.servlet.ShiroFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityFilter {
	
	
	// shiro过滤器
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean bean = new FilterRegistrationBean();
		ShiroFilter filter = new ShiroFilter();
		bean.setFilter(filter);
		bean.addUrlPatterns("/*");
		bean.setDispatcherTypes(DispatcherType.REQUEST,DispatcherType.FORWARD,DispatcherType.INCLUDE,DispatcherType.ERROR);
		bean.setName("shiroFilters");
		return bean;
	}
}
