package com.example.gallary.gallery;
import de.codecentric.boot.admin.config.EnableAdminServer;
import net.sf.ehcache.config.CacheConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
//import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@EnableAdminServer
@SpringBootApplication
@EnableEurekaClient
@EnableCaching
/*@EnableCircuitBreaker
@EnableHystrixDashboard*/
public class GalleryApplication {

	@Bean
	public CacheManager getCacheManager() {
		CacheConfiguration defaultCacheConfig = new CacheConfiguration();
		defaultCacheConfig.setEternal(true);
		defaultCacheConfig.setOverflowToOffHeap(false);
		defaultCacheConfig.setMemoryStoreEvictionPolicy("LRU");
		defaultCacheConfig.setMaxEntriesLocalHeap(1000);

		/*CacheConfiguration lampCacheConfig = new CacheConfiguration();
		lampCacheConfig.setName("lamp");
		lampCacheConfig.setEternal(true);
		lampCacheConfig.setOverflowToOffHeap(false);
		lampCacheConfig.setMemoryStoreEvictionPolicy("LRU");
		lampCacheConfig.setMaxEntriesLocalHeap(1000);*/

		net.sf.ehcache.config.Configuration config = new net.sf.ehcache.config.Configuration();//equivalent to ehcache.xml file
		config.setName("EhCacheMLC");
		config.addDefaultCache(defaultCacheConfig);//Allows BeanHandler to add a default configuration to the configuration.
		//config.addCache(lampCacheConfig);
		/*config.addCache(getDefaultCacheConfig(LAMP_CACHE_NAME));//Allows BeanHandler to add Cache Configurations to the configuration
		config.addCache(getDefaultCacheConfig(FIXTURE_CACHE_NAME));
		config.addCache(getDefaultCacheConfig(USER_CACHE_NAME));
		config.addCache(getDefaultCacheConfig(COMPANY_CACHE_NAME));*/
		config.addCache(getDefaultCacheConfig("STUDENT"));

		net.sf.ehcache.CacheManager cacheManager = net.sf.ehcache.CacheManager
				.newInstance(config);// A factory method to create a CacheManager from a net.sf.ehcache.config.Configuration.
		return new EhCacheCacheManager(cacheManager);
	}
	private CacheConfiguration getDefaultCacheConfig(final String cacheName) {
		CacheConfiguration config = new CacheConfiguration();
		config.setName(cacheName);
		config.setEternal(true);
		config.setOverflowToOffHeap(false);
		config.setMemoryStoreEvictionPolicy("LRU");
		config.setMaxEntriesLocalHeap(1000);

		return config;
	}




	public static void main(String[] args) {
		SpringApplication.run(GalleryApplication.class, args);
	}

}

