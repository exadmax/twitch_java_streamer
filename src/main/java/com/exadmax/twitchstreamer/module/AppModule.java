package com.exadmax.twitchstreamer.module;

import com.google.inject.AbstractModule;


public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(StreamingService.class).to(TwitchStreamingService.class);
        
    }
}
