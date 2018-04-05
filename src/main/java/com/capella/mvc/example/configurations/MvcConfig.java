package com.capella.mvc.example.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.loader.Loader;
import com.mitchellbosecke.pebble.spring4.extension.SpringExtension;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private Loader templateLoader;

    @Autowired
    private SpringExtension springExtension;

    @Bean
    public PebbleEngine pebbleEngine() {
        return new PebbleEngine.Builder()
                        .loader(this.templateLoader)
                        .extension(this.springExtension)
                        .build();
    }

}