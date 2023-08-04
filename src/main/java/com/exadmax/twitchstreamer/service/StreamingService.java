package com.exadmax.twitchstreamer.service;

public interface StreamingService {
    void startStreaming(String streamKey);
    void stopStreaming();
}
