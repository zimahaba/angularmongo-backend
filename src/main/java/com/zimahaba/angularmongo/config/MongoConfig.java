package com.zimahaba.angularmongo.config;

import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import static java.util.Collections.singletonList;

@Profile({"data"})
@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    public String getDatabaseName() {
        return "test";
    }

    @Override
    protected void configureClientSettings(MongoClientSettings.Builder builder) {
        builder.applyToClusterSettings(settings  -> {
            settings.hosts(singletonList(new ServerAddress("172.20.0.2", 27017)));
        });
    }
}
