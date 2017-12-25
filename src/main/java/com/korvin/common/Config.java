package com.korvin.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
//@Component
@ConfigurationProperties(prefix="my")
public class Config {

	private List<String> port = new ArrayList<String>();

	public List<String> getPort() {
		return port;
	}

}