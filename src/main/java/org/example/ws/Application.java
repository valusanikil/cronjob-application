package org.example.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring Boot Main Application
 *
 */
@SpringBootApplication
@EnableCaching
@EnableScheduling	
@EnableAsync
public class Application 
{
    public static void main( String[] args ) throws Exception
    {
    	SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public CacheManager cacheManager() {
    	ConcurrentMapCacheManager cacheManager=new ConcurrentMapCacheManager("greetings");
    	return cacheManager;
    }
    
}
