package com.xuxx.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "hash")
@PropertySource("classpath:hashconfig.yml")
public class HashConfig {
	// 散列算法:这里使用MD5算法
	private String algorithmName;
	// 散列的次数，比如散列两次，相当于md5(md5(""))
	private int iterations;

	public String getAlgorithmName() {
		return algorithmName;
	}

	public int getIterations() {
		return iterations;
	}

}
