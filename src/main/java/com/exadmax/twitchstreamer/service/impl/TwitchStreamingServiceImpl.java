package com.exadmax.twitchstreamer.service.impl;

import com.exadmax.twitchstreamer.service.StreamingService;


public class TwitchStreamingServiceImpl implements StreamingService {
    @Override
    public void startStreaming(String streamKey) {
        System.out.println("Starting Twitch streaming with key: " + streamKey);
        // Implemente a lógica real de streaming para o Twitch aqui
    }

    @Override
    public void stopStreaming() {
        System.out.println("Stopping Twitch streaming");
        // Implemente a lógica para parar o streaming
    }
}
