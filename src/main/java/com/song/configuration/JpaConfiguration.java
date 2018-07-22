package com.song.configuration;

import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;

/**
 * Created by Song on 2017/2/13.
 */
//@Order(Ordered.HIGHEST_PRECEDENCE)
//@Configuration
//@EnableTransactionManagement(proxyTargetClass = true)
//@EnableJpaRepositories(basePackages = "com.song.repository")
//@EntityScan(basePackages = "com.song.entity")
public class JpaConfiguration {
    //@Bean
    PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor(){
        return new PersistenceExceptionTranslationPostProcessor();
    }
}
