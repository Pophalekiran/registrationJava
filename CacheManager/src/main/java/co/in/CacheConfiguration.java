package co.in;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

@Configuration
public class CacheConfiguration {

	@Bean
	  public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory) {
		Set<String> cacheNames = new HashSet<>();
		cacheNames.add("Default123");
	    RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig() //
	        .prefixCacheNameWith(this.getClass().getPackageName() + ".") //
	        .entryTtl(Duration.ofHours(1)) //
	        .disableCachingNullValues();

	    return RedisCacheManager.builder(connectionFactory) //
	        .cacheDefaults(config)
	        .initialCacheNames(cacheNames)//
	        .build();
	  }
}
