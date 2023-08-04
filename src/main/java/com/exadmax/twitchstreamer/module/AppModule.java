package com.exadmax.twitchstreamer.module;

import com.exadmax.twitchstreamer.service.StreamingService;
import com.google.inject.AbstractModule;

import com.exadmax.twitchstreamer.service.impl.TwitchStreamingServiceImpl;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(StreamingService.class).to(TwitchStreamingServiceImpl.class);
        
    }
}
