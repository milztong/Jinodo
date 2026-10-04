package dev.jinodo.ingestion.application.service;

import dev.jinodo.domain.model.Channel;

import java.util.List;

public interface ChannelLoader {
    List<Channel> loadAll();

    /** Channels, die der reguläre Scheduler bei externen Quellen (YouTube, GitHub, ...) abfragen soll. */
    List<Channel> loadIngestable();
}
