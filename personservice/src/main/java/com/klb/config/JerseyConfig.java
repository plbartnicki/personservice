package com.klb.config;

import com.klb.controller.MainController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by com.klb on 11.07.18.
 */
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(MainController.class);
    }
}