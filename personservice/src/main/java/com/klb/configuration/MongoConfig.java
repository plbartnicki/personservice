package com.klb.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class MongoConfig {

    @Bean
    public Mongo mongo() throws Exception {
        return  new MongoClient( "localhost" , 27017 );
    }


}